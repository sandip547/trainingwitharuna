package com.exosolve.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<10000000;i++){
            list.add(i);
        }
        long startTimeAl = System.currentTimeMillis();
        list.get(1000000);
        long endTimeAl = System.currentTimeMillis();
        System.out.println(endTimeAl-startTimeAl);


        List<Integer> linkedList = new LinkedList<>();
        for (int i=1;i<10000000;i++){
           linkedList.add(i);
        }

        long startTimeLl = System.currentTimeMillis();
        linkedList.get(1000000);
        long endTimeLl = System.currentTimeMillis();
        System.out.println(endTimeLl-startTimeLl);



    }
}
