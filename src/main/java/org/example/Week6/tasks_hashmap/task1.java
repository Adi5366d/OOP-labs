package org.example.Week6.tasks_hashmap;

import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("matti", "mat");
        map.put("mikael", "mixu");
        map.put("arto", "arppa");
        System.out.println(map.get("mikael"));
    }
}
