package com.stanislav.patterns.structural.bridge;

import java.io.*;

public class FileLogger extends Logger {


    public FileLogger(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void doLog(String smthInfo) {
        try(BufferedWriter out = new  BufferedWriter(new FileWriter(
                new File("src/com/stanislav/patterns/structural/bridge/log.txt"), true))){
            out.write( manufacturer.writeDate() + " " + smthInfo + "\n");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
