package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main extends Thread{
//    private  static HashMap<String, List<String>> listHashMap =new HashMap<>();
//    static String stare;
    public static void main(String[] args) {
        Stari stare =new Stari();
        Client c =new Client("A",stare);
        Client c1 =new Client("A",stare);
        c.start();
        c1.start();
    }

//    static void initialize(){
//        List<String> list=new ArrayList<>();
//        list.add("B");list.add("C");
//        listHashMap.put("A",list);
//        list = new ArrayList<>();
//        listHashMap.put("B",list);
//        list = new ArrayList<>();
//        list.add("D");
//        listHashMap.put("C",list);
//        list = new ArrayList<>();
//        listHashMap.put("D",list);
//    }
}
