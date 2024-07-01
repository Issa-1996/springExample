package com.tight.coupling;

// A - Mysql, PostgreSQL
// B - Web services, MongoDB

public class UserDatabase {
    public String getUserDetails() {
        //Directly access database here
        return "User Details From DataBase";
    }
}
