package main.java.database;

import java.util.Objects;

public class Connection {

    private static Connection INSTANCE;
    private String strConnection = "dummy str connection";
    private Connection(){}

    public static Connection getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new Connection();
        }
        return INSTANCE;
    }

    public String getStrConnection(){
        return this.strConnection;
    }
}
