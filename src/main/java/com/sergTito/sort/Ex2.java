package com.sergTito.sort;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {

        /*
          Реализуйте функцию сортировки выбором в Java, которая будет работать с массивом целых чисел.
          Напишите программу, которая будет генерировать случайные числа и отсортировать их с помощью этого алгоритма.
          Попробуйте оптимизировать алгоритм, чтобы уменьшить количество операций сравнения.
         */

        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(120);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }


        /*
        Реализуйте функцию бинарного поиска в Java, которая будет работать с отсортированным массивом целых чисел.
        Напишите программу, которая будет находить элементы в массиве с помощью бинарного поиска.
        Попробуйте найти элементы в массиве с помощью бинарного поиска и сравните время выполнения с простым линейным поиском.
         */



    }

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            int min = arr[i];

            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }


    }
}
