package com.sergTito;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class Solution {


    public static void main(String[] args) {

        int resultA = 0;
        int resultB = 0;


//        int[] a = {4, 5, 6, 2};
//        int[] b = {2, 4, 3, 1};
        List<Integer> arr = List.of(1,2,3,4);
        List<Integer> brr = List.of(2, 4, 3, 1);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > brr.get(i)){

            }
        }


//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < b[i]) {
//                resultB++;
//            } else if (a[i] > b[i]) {
//                resultA++;
//            }
//        }

        System.out.println(resultA + " " + resultB);
    }
//    public int[] addTwoNumbers(int[] l1, int[] l2) {
//
//        l1 = new int[]{1, 3, 5};
//        l2 = new int[]{4, 10, 22};
//
//        int a;
//        int b;
//
//        for (int i = 0; i < l1.length; i++) {
//            a = l1[i];
//        }
//
//
//
//
//        return ;
//
//    }
}
