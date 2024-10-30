package com.sergTito.sort;

public class Main {
    public static void main(String[] args) {
        int[] newArr = {4,5,6,12,10,53,44,30,21,1};
        int smallest = findSmallest(newArr);
        System.out.println(smallest);



        int[] sortArr = {12, 6, 4, 1, 15, 10};
        selectionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i]+ " ");
        }

    }


    private static int findSmallest(int[] arr){
        int smallest = arr[0];
        int smallest_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
                smallest_index = i;
            }
        }
        return smallest;
    }

    //12, 6, 4, 1, 15, 10
    public static void selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
    }
}
