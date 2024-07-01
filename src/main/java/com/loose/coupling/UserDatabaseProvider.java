package com.loose.coupling;

// A - Mysql, PostgreSQL
// B - Web services, MongoDB

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        //Directly access database here
        return "User Details From DataBase";
    }
}
