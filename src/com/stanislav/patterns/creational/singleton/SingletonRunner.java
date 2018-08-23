package com.stanislav.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonRunner {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        List<Programm> programmList = new ArrayList<>();
        programmList.add(new Programm("MS_WORD", 1));
        programmList.add(new Programm("MS_WORD2", 10));
        programmList.add(new Programm("MS_WORD3", 9));
        programmList.add(new Programm("MS_WORD4", 5));
        programmList.add(new Programm("MS_WORD5", 5));
        programmList.add(new Programm("MS_WORD6", 6));
        programmList.add(new Programm("MS_WORD7", 4));
        programmList.add(new Programm("MS_WORD8", 10));

        for(Programm programm: programmList){
            es.execute(() -> {
                programm.startProgramm(Server.getServer());
            });
        }
        es.shutdown();
        try {
            es.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Server.getServer().getFreeMemory());
    }

}
