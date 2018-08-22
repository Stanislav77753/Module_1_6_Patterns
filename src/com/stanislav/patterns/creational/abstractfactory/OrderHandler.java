package com.stanislav.patterns.creational.abstractfactory;

import com.stanislav.patterns.creational.abstractfactory.exceptions.EmptyFileException;
import com.stanislav.patterns.creational.abstractfactory.model.CompanyOneOrderFactory;
import com.stanislav.patterns.creational.abstractfactory.model.CompanyTwoOrderFactory;
import com.stanislav.patterns.creational.abstractfactory.model.OrderFactory;
import com.stanislav.patterns.creational.abstractfactory.model.Product;
import com.stanislav.patterns.creational.factorymethod.example2.exceptions.DirectoryIsEmptyException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrderHandler {
    File directory = new File("src/com/stanislav/patterns/creational/abstractfactory/resources/orders");
    File products = new File("src/com/stanislav/patterns/creational/abstractfactory/resources/products.txt");
    File[] files = directory.listFiles();
    ExecutorService es = Executors.newFixedThreadPool(4);

    /**
     * This method parse file by order and create list with id of product and count of product
     * @param file
     * @return
     * @throws EmptyFileException
     */
    private List<String> readFileOrder(File file) throws EmptyFileException {
        int countPosition = 0;
        List<String> idAndCountProductsList = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader(file))){
            String str;
            do{
                str = in.readLine();
                if(str == null && countPosition == 0){
                    throw new EmptyFileException("DataBase is empty");
                }else if(str != null){
                    idAndCountProductsList.add(str);

                }
                countPosition++;
            }while(str != null);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return idAndCountProductsList;
    }

    /**
     * This method create List orders
     * @param idAndCountProductList
     * @return
     */
    private List<String> makeAllProductList(List<String> idAndCountProductList){
        List<String> listProduct = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader(products))){
            String str;
            do{
                str = in.readLine();
                if(str != null){
                    String[] product = str.split(" - ");
                    for(String productLine: idAndCountProductList){
                        String[] productIdAndCount = productLine.split(" - ");
                        if(product[0].equals(productIdAndCount[0])){
                            String inListProduct = productIdAndCount[0] + " " + productIdAndCount[1] + " "
                                    + product[1] + " " + product[2];
                            listProduct.add(inListProduct);
                        }
                    }
                }
            }while(str != null);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return listProduct;
    }

    /**
     * This method create List of product by called abstract factory. For different companies prices are different
     * @param file
     * @return
     * @throws EmptyFileException
     */
    private List<Product> createProductList(File file) throws EmptyFileException {
        List<Product> products = new ArrayList<>();
        String companyName = file.getName();
        int index = companyName.lastIndexOf('.');
        String orderFactoryName = companyName.substring(0, index).toLowerCase();
        OrderFactory orderFactory;
        if(orderFactoryName.equals("companyone")){
           orderFactory = new CompanyOneOrderFactory();
            products = orderFactory.createOrder(makeAllProductList(readFileOrder(file)));
        }else{
            orderFactory = new CompanyTwoOrderFactory();
            products = orderFactory.createOrder(makeAllProductList(readFileOrder(file)));
        }
        return products;
    }

    /**
     * This method record into files in folder resources/checks
     * @param file
     * @throws EmptyFileException
     */
    private void createOneCheck(File file) throws EmptyFileException {
        List<Product> products = createProductList(file);
        String name = file.getName();
        int index = name.lastIndexOf('.');
        String fileName = name.substring(0, index) + "Check.txt";
        String path = "src/com/stanislav/patterns/creational/abstractfactory/resources/checks/" + fileName;
        try(BufferedWriter out = new BufferedWriter(new FileWriter(path))){
            out.write("Наименование" + "\t" + "Цена" + "\t" + "Количество" + "\t" + "Сумма" + "\r\n");
            int sum = 0;
            for(Product product: products){
                out.write(product.getName() + "\t" + product.getPrice() + "\t" + product.getCount()
                + " \t" + (product.getCount()*product.getPrice()) + "\r\n");
                sum += product.getCount()*product.getPrice();
            }
            out.write("----------------------------------"+ "\r\n");
            out.write("Итого к оплате - " + sum);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * This method call createOneCheck in several threads
     * @param files
     * @throws DirectoryIsEmptyException
     */
    private void createChecks(File[] files) throws DirectoryIsEmptyException {
        if(files.length == 0){
            throw new DirectoryIsEmptyException("directory is empty");
        }else{
            for(File file: files){
                if(file.isFile()){
                    es.execute(()->{
                        try {
                            createOneCheck(file);
                        } catch (EmptyFileException e) {
                            System.out.println(e.getMessage());
                        }
                    });
                }
            }
            es.shutdown();
            try {
                es.awaitTermination(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void start(){
        try {
            createChecks(files);
        } catch (DirectoryIsEmptyException e) {
            System.out.println(e.getCause());
        }
    }

}
