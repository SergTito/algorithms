package com.sergTito;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class Solution {


    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("privet");
        arr.add("poke");
        arr.add("ok");
        arr.add("hello");
//
//        for (int i = 0; i < arr.size(); i++) {
//          arr.set(i, String.valueOf(arr.get(i).length()));
//
//        }



        List<Integer> list2 = arr.stream()
                .map(element->element.length())
                .collect(Collectors.toList());
        System.out.println(list2);



        Auto auto1 = new Auto("Audi",201);
        Auto auto2 = new Auto("BMW",100);
        Auto auto3 = new Auto("Mersedes",251);
        Auto auto4 = new Auto("Toyota",301);
        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);

        autos = autos.stream()
                .filter(auto -> auto.getName().equalsIgnoreCase("bmw") || auto.getMaxSpeed() == 301)
                .collect(Collectors.toList());
        System.out.println(autos);





    }



}
