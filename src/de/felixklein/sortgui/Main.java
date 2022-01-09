package de.felixklein.sortgui;

import de.felixklein.sortgui.gui.MainFrame;
import de.felixklein.sortgui.sort.SortUtil;

public class Main {

    public static void main(String[] args) {
        //MainFrame frame = new MainFrame();
        //frame.setVisible(true);

        testBubbleSort();
    }

    private static void testBubbleSort() {
        int[] numbers = new int[] {1, 3, 3, 2, 5};

        int[] sortedNumbers = SortUtil.bubbleSort(numbers);

        printArray(sortedNumbers);
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

}
