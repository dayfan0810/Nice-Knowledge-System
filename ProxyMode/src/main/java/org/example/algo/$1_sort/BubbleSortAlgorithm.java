package org.example.algo.$1_sort;

public class BubbleSortAlgorithm extends SortAlgo {
    public static void main(String[] args) {
        int[] arr = {11, 5, 88, 13, 12, 18, 11, 0, 89}; // 将此数组按照从小到大顺序排列

        printArr(arr);
        int n = arr.length;
        boolean swapped = false;
        for (int end = n - 1; end > 0; end--) {
            for (int j = 0; j < end; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            //结束一轮后看数组是否发生元素交换，如果一次也没有，那么flag不会被置为true
            if (!swapped) {
                break;
            }
        }
        printArr(arr);
    }
}
