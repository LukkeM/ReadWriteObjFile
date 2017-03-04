package com.sdajava.rwobj;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String fileName = "c://Users//lukas//obiekty.txt";

        Person p1 = new Person("Jan", "Kowalski",21);
        Person p2 = new Person("Jan", "Kowalski",21);
        Person p3 = new Person("Jan", "Kowalski",21);

        try {

            FileOutputStream fileOutputStream
                    = new FileOutputStream(new File(fileName), true);
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(p3);

            fileOutputStream.close();
            objectOutputStream.close();

        }catch (FileNotFoundException err) {
            err.printStackTrace();
        }catch (IOException err){
            err.printStackTrace();
        }




    }
}
