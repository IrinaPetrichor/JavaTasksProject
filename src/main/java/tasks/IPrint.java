package tasks;

import java.util.Arrays;

public interface IPrint extends IColor {

    default void printMessage(String message) {
        System.out.printf("%s%s%s%n", COLOR_GREEN, message, COLOR_RESET);
    }

    default void printResult(String result) {
        if (result.contains("ERROR:")) {
            System.out.printf("%s%s%s%n%n%n", COLOR_RED, result, COLOR_RESET);
        } else {
            System.out.printf("%s%s%s%n%n%n", COLOR_BLUE, result, COLOR_RESET);
        }
    }

    default void printResultIInLine(String result) {
        if (result.contains("ERROR:")) {
            System.out.printf("%s%s%s%n%n%n", COLOR_RED, result, COLOR_RESET);
        } else {
            System.out.printf("%s%s%s  ", COLOR_BLUE, result, COLOR_RESET);
        }
    }

    default void printError(String error) {
        System.out.printf("%s%s%s%n", COLOR_RED, error, COLOR_RESET);
    }

    default void print2DArray(int[][] array) {
        String string = Arrays.deepToString(array);
        string = " " + string.substring(1, string.length() - 1);
        string = string.replaceAll("],", "]; ");

        String[] array1D = string.split("; ");

        System.out.println();
        for(String row : array1D) {
            System.out.println(row);
        }
    }
}