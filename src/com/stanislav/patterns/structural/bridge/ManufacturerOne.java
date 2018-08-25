package com.stanislav.patterns.structural.bridge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManufacturerOne implements Manufacturer {
    @Override
    public String writeDate() {
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        return dateFormat.format(dateNow);
    }
}
