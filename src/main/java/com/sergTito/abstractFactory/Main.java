package com.sergTito.abstractFactory;

import com.sergTito.abstractFactory.absFuctory.CarsFactory;
import com.sergTito.abstractFactory.absFuctory.FordFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CarsFactory carsFactory = new FordFactory();
        Suv suv = carsFactory.createSuv();
        suv.description();
        int[][] arr = {{1, 2, 3}
                , {4, 5, 6}
                , {7, 2, 3}};


        int[] sum = new int[arr.length];
        int[] sum2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum[i] = arr[i][i];
            sum2[i] = arr[i][arr.length - i - 1];
        }
        int sumRow = 0;
        int sumCols = 0;
        for (int j : sum) {
            sumRow += j;
        }
        for (int j : sum2) {
            sumCols += j;
        }
        System.out.println(sumRow - sumCols);


        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        int result1 = 0;
        int result2 = 0;
        List<List<Integer>> arrA = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,2,3),
                Arrays.asList(2,4,5),
                Arrays.asList(5,6,9)
        );
        for (int i = 0; i < arrA.size(); i++) {
                res1.add(arrA.get(i).get(i));
                res2.add(arrA.get(i).get(arrA.size() - i - 1));
        }
        for (Integer integer : res1) {
            result1 += integer;
        }
        for (Integer integer : res2) {
            result2 += integer;
        }
        System.out.println(result1 - result2);

    }


    public static int diagonalDifference(List<List<Integer>> arr) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            list1.add(arr.get(i).get(i));
            list2.add(arr.get(i).get(arr.size() - i - 1));
        }
        int res1 = 0;
        int res2 = 0;
        for (Integer integer : list1) {
            res1 += integer;
        }
        for (Integer integer : list2) {
            res2 += integer;
        }
        return res1 - res2;
    }
}
