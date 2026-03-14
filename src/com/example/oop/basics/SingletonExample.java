package com.example.oop.basics;

class DBConnection {
    private static DBConnection instance;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void getFromDB() {
        System.out.println("Dane z bazy");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        System.out.println(connection2 == connection1);
        connection2.getFromDB();
    }
}
