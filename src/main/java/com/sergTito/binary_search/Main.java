package com.sergTito.binary_search;

import java.time.LocalTime;

public class Main {
    private static final long START = System.currentTimeMillis();
    private static final long END = System.currentTimeMillis();

    public static void main(String[] args) {
        int[] arr = new int[100];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
            num++;

            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();

        System.out.println("binarySearch(arr,43)");
        System.out.println(binarySearch(arr, 43));

        System.out.println("defaultSearch(arr,43)");
        defaultSearch(arr, 43);
    }

    private static int binarySearch(int[] arr, int item) {

        int count = 1;
        int low = arr[0];
        int high = arr[arr.length - 1];

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else low = mid + 1;
            count++;
        }
        return -1;
    }

    private static void defaultSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(arr[i]);
            }
        }
    }
}
