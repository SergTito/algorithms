package com.sergTito.sort;

public class Example {
    public static void main(String[] args) {

        int[] arr = {12, 6, 4, 1, 15, 10};
        sortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    private static void sortArr(int[] arr){
        // 12,32,3,45,6,79,1,23,4
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    pos = j;
                    min = arr[j];
                }
            }

            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
