package de.felixklein.sortgui.sort;

import java.util.Arrays;

public class SortUtil {

    public static int[] sort(int[] toBeSorted, SortType sortType) {
        switch(sortType) {
            case BubbleSort:
                return bubbleSort(toBeSorted);
            case SelectionSort:
                return selectionSort(toBeSorted);
            default:
                return toBeSorted;
        }
    }

    private static int[] bubbleSort(int[] toBeSorted) {
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

    private static int[] selectionSort(int[] toBeSorted) {
        //Elemente in ein neues Array kopieren, um das übergebene Array nicht zu verändern.
        int[] result = Arrays.copyOf(toBeSorted, toBeSorted.length);

        //n = Länge des Arrays (result.length)
        //Schleife wird n - 1 Mal durchlaufen
        for(int i = 0; i < result.length - 1; i++) {

            //Speichert den Index des größten Elementes.
            int biggest = 0;

            //Schleife wird n - i durchlaufen. Hiermit wird erreicht, dass die innere Schleife mit jedem Durchlauf der äußeren Schleife einmal weniger durchlaufen wird.
            //Bei diesem Sortierverfahren wird in jedem Durchlauf immer das größte Element an den rechten Rand verschoben. Aus diesem Grund muss man im nächsten Durchgang das Element am rechten Rand nicht mehr testen.
            for(int j = 0; j < result.length - i; j++) {

                if(result[biggest] < result[j]) {
                    biggest = j;
                }

            }

            int temp = result[result.length - 1 - i];
            result[result.length - 1 - i] = result[biggest];
            result[biggest] = temp;

        }

        return result;
    }

}
