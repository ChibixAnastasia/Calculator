package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main (String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("nina");
        arr.add("anna");
        arr.add("lisa");
        arr.add("pavel");
        arr.add("dim");

       List<Integer> arr2 = arr.stream().map(el->el.length()).collect(Collectors.toList());
        System.out.println(arr2);
    }
}
