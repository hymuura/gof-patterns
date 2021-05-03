package main.java;

import main.java.database.Connection;

import java.util.Objects;

public class Singleton {

    public static void main(String[] args){
        System.out.println("Hello Singleton!");
        Connection c = Connection.getInstance();
        System.out.println(c.getStrConnection());
        Connection c2 = Connection.getInstance();
        System.out.println(Objects.equals(c, c2));
    }
}
