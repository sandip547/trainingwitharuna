package com.exosolve.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        Employee eone = new Employee(1,"Aruna",120,"female");
        Employee etwo = new Employee(3,"Arun",120,"male");
        Employee ethree = new Employee(367,"Ark",150,"male");


        List<Employee> list = new ArrayList<>();
        list.add(eone);
        list.add(etwo);
        list.add(ethree);

        System.out.println(list.size());
        System.out.println(list.contains(etwo));
        System.out.println(list.set(1,new Employee(368,"Villan",170,"male")));


        for (Employee employee:list){
            System.out.println("Id: "+ employee.getEmpId() + " Name : "+ employee.getEmpName() + " Salary : " + employee.getEmpSalary() + " Gender :  "+ employee.getGender());
        }



    }
}
