package tasks;

import java.util.Scanner;

interface IScan extends IPrint {

    private int getIntInput() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number: ");

        int number = Integer.MIN_VALUE;

        try {
            number = Integer.parseInt(scanner.nextLine());  // Read user input
        } catch (Exception e) {
            printMessage("ERROR: You should enter the whole number.");
            getIntInput();
        }

        return number;
    }

    private String getStringInput() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter string: ");

        String chars = "";

        try {
            chars = scanner.nextLine();  // Read user input
        } catch (Exception e) {
            printMessage("ERROR: Invalid input.");
            getStringInput();
        }

        return chars;
    }

    default int processOneInput(String message) {
        Utils.printTaskNumber();
        printMessage(message);

        return getIntInput();
    }

    default int[] processTwoInputs(String message) {
        Utils.printTaskNumber();
        printMessage(message);

        return new int[]{getIntInput(),  getIntInput()};
    }

    default int[] processThreeInputs(String message) {
        Utils.printTaskNumber();
        printMessage(message);

        return new int[]{getIntInput(),  getIntInput(), getIntInput()};
    }

    default int[] processFourInputs(String message) {
        Utils.printTaskNumber();
        printMessage(message);

        return new int[]{getIntInput(),  getIntInput(), getIntInput(), getIntInput()};
    }

    default String processStringInput(String message) {
        Utils.printTaskNumber();
        printMessage(message);

        return getStringInput();
    }
}