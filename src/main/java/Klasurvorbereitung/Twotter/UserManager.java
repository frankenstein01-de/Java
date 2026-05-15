package Klasurvorbereitung.Twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager{
    @Override
    public void serialize(List object){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))){
            oos.writeObject(object);
            oos.flush();

        }catch (IOException e){
            throw new RuntimeException("Speicher auf User.dat hat nicht funktioniert"+e.getMessage());
        }

    }
    @Override
    public List deserialize(){
        List userList = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))){
            userList = (List) ois.readObject();



        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException("Das aufrufen aus User.dat hat nicht Funktioniert"+e.getMessage());

        }
        return userList;

    }
}
