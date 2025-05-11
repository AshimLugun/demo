package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
                map.put("Apple", 3);
                map.put("Banana", 5);
                map.put("Orange", 2);

        map.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

    }
        }




