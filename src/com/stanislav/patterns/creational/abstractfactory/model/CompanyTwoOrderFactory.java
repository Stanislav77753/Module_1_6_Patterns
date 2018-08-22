package com.stanislav.patterns.creational.abstractfactory.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyTwoOrderFactory implements OrderFactory {
    @Override
    public List<Product> createOrder(List<String> products) {
        List<Product> productList = new ArrayList<>();
        for(String product: products){
            String[] productNamePriceCount = product.split(" ");
            switch (productNamePriceCount[2]){
                case "milk":
                    productList.add(new Milk(new Double(productNamePriceCount[3]),
                            new Integer(productNamePriceCount[1])));
                    break;
                case "coffee":
                    productList.add(new Coffee(new Double(productNamePriceCount[3]),
                            new Integer(productNamePriceCount[1])));
                    break;
                case "sweets":
                    productList.add(new Sweets(new Double(productNamePriceCount[3]),
                            new Integer(productNamePriceCount[1])));
            }
        }
        return productList;
    }
}
