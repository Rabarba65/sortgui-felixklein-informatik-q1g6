package de.felixklein.sortgui.sort;

import java.util.Arrays;

public class SortUtil {

    public static int[] bubbleSort(int[] toBeSorted) {
        int[] result = Arrays.copyOf(toBeSorted, toBeSorted.length);

        for(int i = 0; i < result.length - 1; i++) {

            for(int j = 0; j < result.length - 1 - i; j++) {

                if(result[j] > result[j + 1]) {
                    int bigger = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = bigger;
                }

            }

        }

        return result;
    }

    public static int[] selectionSort(int[] toBeSorted) {
        return new int[0];
    }

    public static int[] insertionSort(int[] toBeSorted) {
        return new int[0];
    }

}
