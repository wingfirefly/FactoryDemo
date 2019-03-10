package com.xxniu.app.singleton.hungry;

import com.xxniu.app.singleton.register.EnumSingleton;

import java.io.*;

public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton singleton = SeriableSingleton.getInstance();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("test.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SeriableSingleton o1 = (SeriableSingleton) objectInputStream.readObject();
            System.out.println(o1);
            System.out.println(singleton);
            System.out.println(o1 == singleton);

            System.out.println(EnumSingleton.INSTANCE==EnumSingleton.getInstance());
            System.out.println(EnumSingleton.getInstance()==EnumSingleton.values()[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
