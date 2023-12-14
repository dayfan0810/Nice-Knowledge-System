package org.example.algo;

public class SortAlgo {

    public static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.print("\n");
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

