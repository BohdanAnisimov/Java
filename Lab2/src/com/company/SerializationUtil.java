package com.company;
import java.io.*;

public class SerializationUtil {
    public static void serialize(Person person, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(person);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static Person deserialize(String path) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)))
        {
            return (Person)ois.readObject();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
