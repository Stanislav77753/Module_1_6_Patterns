package com.stanislav.patterns.creational.abstractfactory.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyOneOrderFactory implements OrderFactory {
    private Double milkDiscount = 0.05;
    private Double coffeeDiscount = 0.2;
    private Double sweetsDiscount = 0.15;

    @Override
    public List<Product> createOrder(List<String> products) {
        List<Product> productList = new ArrayList<>();
        for(String product: products){
            String[] productNamePriceCount = product.split(" ");
            switch (productNamePriceCount[2]){
                case "milk":
                    productList.add(new Milk(new Double(productNamePriceCount[3])*(1-milkDiscount),
                            new Integer(productNamePriceCount[1])));
                    break;
                case "coffee":
                    productList.add(new Coffee(new Double(productNamePriceCount[3])*(1-coffeeDiscount),
                            new Integer(productNamePriceCount[1])));
                    break;
                case "sweets":
                    productList.add(new Sweets(new Double(productNamePriceCount[3])*(1-sweetsDiscount),
                            new Integer(productNamePriceCount[1])));
            }
        }
        return productList;
    }
}
