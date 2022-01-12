package de.felixklein.sortgui.gui;

import de.felixklein.sortgui.sort.SortType;
import de.felixklein.sortgui.sort.SortUtil;

import javax.swing.*;
import java.util.regex.Pattern;

public class MainFrame extends JFrame {
    private JPanel root;
    private JTextField tfInput;
    private JTextField tfOutput;
    private JRadioButton rSelectionSort;
    private JRadioButton rBubbleSort;
    private JButton btnSort;

    public MainFrame() {
        super("Felix Klein - SortGUI v1.3");

        setSize(550, 350);
        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(root);

        rSelectionSort.setSelected(true);

        btnSort.addActionListener(e -> {
            int[] numbers = getInputAsNumbers();

            SortType sortType;
            if(rBubbleSort.isSelected())
                sortType = SortType.BubbleSort;
            else
                sortType = SortType.SelectionSort;

            int[] result = SortUtil.sort(numbers, sortType);

            String output = "";

            for(int i = 0; i < result.length; i++) {
                output += result[i] + " ";
            }

            tfOutput.setText(output);
        });

        rBubbleSort.addActionListener(e -> {
            if(rSelectionSort.isSelected()) {
                rSelectionSort.setSelected(false);
                rBubbleSort.setSelected(true);
            }
        });

        rSelectionSort.addActionListener(e -> {
            if(rBubbleSort.isSelected()) {
                rBubbleSort.setSelected(false);
                rSelectionSort.setSelected(true);
            }
        });
    }

    private int[] getInputAsNumbers() {
        Pattern p = Pattern.compile("\\d+");

        if(p.matcher(tfInput.getText()).matches()) {
            String[] splittedText = tfInput.getText().split("");

            int[] numbers = new int[splittedText.length];

            int i = 0;
            for(String number : splittedText) {
                numbers[i] = Integer.parseInt(number);
                i++;
            }

            return numbers;
        }

        JOptionPane.showMessageDialog(this, "Bitte nur Zahlen eingeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);

        return new int[0];
    }

}
