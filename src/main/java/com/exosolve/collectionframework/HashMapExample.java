package com.exosolve.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
//        List<String> s = new ArrayList<>();
//        s.add("User");
//        s.add("Admin");
        map.put("aruna25",List.of("User","Admin"));
        map.put("sandip78",List.of("User","Admin","Staff"));
        map.put("aruna25",List.of("User","Admin","Staff"));

        System.out.println(map.get("aruna25"));
        System.out.println(map.get("sandip78"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (String key: map.keySet()){
            System.out.println(key);
        }

//        int [] a = {5,7};
//        for (int value:a){
//            System.out.println(value);
//        }

        for (Map.Entry<String,List<String>> entry: map.entrySet()){

            System.out.println("key :" + entry.getKey()  + "value : "+ entry.getValue());
        }




    }
}
