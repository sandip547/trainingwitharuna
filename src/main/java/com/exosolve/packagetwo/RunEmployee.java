package com.exosolve.packagetwo;

import com.exosolve.packageone.*;


public class RunEmployee {

    public static void main(String[] args) {
        Employee e = new Employee(1,"aruna");



        System.out.println(e.toString());

        Tax  t = new Tax();

        RunEmployee runEmployee = new RunEmployee();
        System.out.println(runEmployee.toString());


        System.out.println(DatabaseConnection.connectionURL);
        DatabaseConnection dbOne = new DatabaseConnection();

        System.out.println(dbOne.connectionURL);

        DatabaseConnection.connectionURL = "mysql:jdbc//localhost:3307";

        DatabaseConnection dbTwo = new DatabaseConnection();

        System.out.println(dbOne.connectionURL);
        System.out.println(dbTwo.connectionURL);



    }
}
