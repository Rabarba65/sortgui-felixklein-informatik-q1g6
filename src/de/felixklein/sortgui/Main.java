package de.felixklein.sortgui;

import de.felixklein.sortgui.gui.MainFrame;
import de.felixklein.sortgui.sort.SortType;
import de.felixklein.sortgui.sort.SortUtil;

public class Main {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

        //testBubbleSort();
        //testSelectionSort();
    }

    private static void testBubbleSort() {
        int[] numbers = new int[] {1, 3, 3, 2, 5};

        int[] sortedNumbers = SortUtil.sort(numbers, SortType.BubbleSort);

        System.out.println("BubbleSort:");
        printArray(sortedNumbers);
    }

    private static void testSelectionSort() {
        int[] numbers = new int[] {1, 3, 8, 3, 2, 5};

        int[] sortedNumbers = SortUtil.sort(numbers, SortType.SelectionSort);

        System.out.println("SelectionSort:");
        printArray(sortedNumbers);
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

}
