package com.stanislav.patterns.behavioral.memento.repository;

import com.stanislav.patterns.behavioral.memento.Save;
import com.stanislav.patterns.behavioral.memento.User;

import java.io.*;

public class SaveRepository {
    Save save;
    public void addSave(Save save){
        try(BufferedWriter out = new BufferedWriter(
                new FileWriter("src/com/stanislav/patterns/behavioral/memento/resources/gamesave.txt",
                        true))){
            out.write("---------------------" + "\r\n");
            out.write(save.getNameSave() + "\r\n");
            out.write(save.getLevel() + "\r\n");
            out.write(save.getUser().getName() + "\r\n");
            out.write(save.getUser().getForse() + "\r\n");
            out.write(save.getUser().getProtection() + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Save getSave(String saveName){
        int countSaves = 0;
        Integer level = 0;
        String userName = "";
        Integer userForse = 0;
        Integer userProtection = 0;
        try(BufferedReader in = new BufferedReader(
                new FileReader("src/com/stanislav/patterns/behavioral/memento/resources/gamesave.txt"))){
            String str;
            do{
                str = in.readLine().trim();
                if(str == null && countSaves == 0){
                    throw new RuntimeException("нет ни одного сохранения");
                }else if(str.equals(saveName)){
                    level = new Integer(in.readLine().trim());
                    userName = in.readLine().trim();
                    userForse = new Integer(in.readLine().trim());
                    userProtection = new Integer(in.readLine().trim());
                    return new Save(saveName, level, new User(userName, userForse, userProtection));
                }
                countSaves++;
            }while (str != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
