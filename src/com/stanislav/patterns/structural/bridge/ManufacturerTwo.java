package com.stanislav.patterns.structural.bridge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManufacturerTwo implements Manufacturer {
    @Override
    public String writeDate() {
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.yyyy");
        return dateFormat.format(dateNow);
    }
}
