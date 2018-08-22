package com.stanislav.patterns.creational.factorymethod.example2.model;

import com.stanislav.patterns.creational.factorymethod.example2.exceptions.DirectoryIsEmptyException;
import com.stanislav.patterns.creational.factorymethod.example2.exceptions.UnknownFileExtension;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileHandler {
    File[] files;
    ExecutorService es = Executors.newFixedThreadPool(4);
    public FileHandler(File directory) {
        files = directory.listFiles();
    }

    public void HandleFile()throws DirectoryIsEmptyException {
        if(files.length == 0){
            throw new DirectoryIsEmptyException("directory is empty");
        }else{
            for(File file: files){
                if(file.isFile()){
                    es.execute(()->{
                        try {
                            Handler handler = createHandlerFile(readFileExtension(file));
                            handler.readFromFile();//readFromFile не реализован
                            handler.writeInFile();// не реализован
                        } catch (UnknownFileExtension unknownFileExtension) {
                            System.out.println(unknownFileExtension.getMessage());
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

    public String readFileExtension(File file){
        String fileName = file.getName();
        int index =fileName.lastIndexOf(".");
        return fileName.substring(index+1);
    }

    public Handler createHandlerFile(String fileExtension) throws UnknownFileExtension {
        HandlerFactory handlerFactory;
        if(fileExtension.equals("xml")){
            handlerFactory = new XmlHandlerFactory();
            return handlerFactory.createHandler();
        }else if(fileExtension.equals("json")){
            handlerFactory = new JsonHandlerFactory();
            return handlerFactory.createHandler();
        }else{
            throw new UnknownFileExtension("Unknown file extension");
        }
    }


}
