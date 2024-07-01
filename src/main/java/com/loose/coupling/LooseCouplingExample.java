package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDatabaseProvider databaseProvider = new UserDatabaseProvider();
        System.out.println(databaseProvider.getUserDetails());
    }
}
