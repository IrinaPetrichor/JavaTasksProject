package tasks;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class IfElseTasks implements IPrint {
    /*
     * Conditional operators:
     */

    /*
     * 1. The user enters a number in the console. If it is greater than 10,
     *    display the message “The number is greater than 10.” in the console,
     *    if it is smaller – “The number is less than 10.”.
     */
    void isLessOrMore(int number) {
        String result;

        if (number != 10) {
            result = number > 10 ? "The number is greater than 10." : "The number is less than 10.";
        } else result = Error.ERROR_OUT_OF_SCOPE.get();

        printResult(result);
    }


    /*
     * 2. The user enters two numbers in the console.
     *    Display the message “The first number is greater/less than the second.”
     *    depending on the result of their comparison.
     */
    private void compareNumbers(int number1, int number2) {
        String result =
                (number1 > number2) ?
                        "The first number is greater than the second." :
                        (number1 < number2) ?
                                "The first number is less than the second." :
                                Error.ERROR_OUT_OF_SCOPE.get();

        printResult(result);
    }

    void compareNumbers(int[] inputs) {
        if (inputs.length == 2) {
            compareNumbers(inputs[0], inputs[1]);
        } else {
            printError(Error.ERROR_INVALID.get());
        }
    }


    /*
     * 3. The user enters the lengths of the sides of a triangle (three numbers).
     *    Output a message indicating whether the triangle is isosceles, equilateral, or scalene.
     */
    private void identifyTriangleType(int side1, int side2, int side3) {
        String result;

        if (side1 == side2 && side1 == side3) {
            result = "The triangle is equilateral.";
        } else if (side1 != side2 && side2 != side3 && side1 != side3) {
            result = "The triangle is scalene.";
        } else {
            result = "The triangle is isosceles.";
        }

        printResult(result);
    }

    void identifyTriangleType(int[] inputs) {
        if (inputs.length == 3) {
            identifyTriangleType(inputs[0], inputs[1], inputs[2]);
        } else {
            printError(Error.ERROR_INVALID.get());
        }
    }


    /*
     * 4. The user enters four numbers in the console.
     *    Calculate and display the number of negative and positive numbers in the console.
     */
    private void calculatePositivesAndNegatives(int number1, int number2, int number3, int number4) {
        int[] numbers = new int[]{number1, number2, number3, number4};
        int[] counts = Utils.getZeroPosNegCounts(numbers);
        int countZeros = counts[0];
        int countPositives = counts[1];
        int countNegatives = counts[2];
        String result;

        if (countZeros == 0) {
            result = String.format(
                    "Your input contains: %n\t%d positive numbers,%n\t%d negative numbers.",
                    countPositives, countNegatives
            );
        } else {
            result = String.format(
                    "Your input contains one or more zeros, which are not included in the final analysis:" +
                            "%n\t%d positive numbers,%n\t%d negative numbers.", countPositives, countNegatives
            );
        }

        printResult(result);
    }

    void calculatePositivesAndNegatives(int[] inputs) {
        if (inputs.length == 4) {
            calculatePositivesAndNegatives(inputs[0], inputs[1], inputs[2], inputs[3]);
        } else {
            printError(Error.ERROR_INVALID.get());
        }
    }


    /*
     * 5. The user enters three numbers in the console, and the largest one is displayed.
     */
    private int getMax(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }

    private int getMin(int number1, int number2, int number3) {
        return Math.min(number1, Math.min(number2, number3));
    }

    private void findMax(int number1, int number2, int number3) {
        printResult(String.format("The maximum number among all inputs is %d",
                getMax(number1, number2, number3)
        ));
    }

    void findMax(int[] inputs) {
        if (inputs.length == 3) {
            findMax(inputs[0], inputs[1], inputs[2]);
        } else {
            printError(Error.ERROR_INVALID.get());
        }
    }


    /*
     * 6. The user enters three numbers in the console.
     *    Calculate and display the sum of the largest and smallest numbers.
     */
    private void sumMinMaxNumbers(int number1, int number2, int number3) {
        int sum = getMax(number1, number2, number3) + getMin(number1, number2, number3);
        printResult(String.format("The sum of the largest and smallest numbers is: %d", sum));
    }

    void sumMinMaxNumbers(int[] inputs) {
        if (inputs.length == 3) {
            sumMinMaxNumbers(inputs[0], inputs[1], inputs[2]);
        } else {
            printError(Error.ERROR_INVALID.get());
        }
    }


    /*
     * 7. The user enters a number in the console.
     *    Display a message indicating whether the number is even or odd.
     */
    void isEvenOrOdd(int number) {
        String result = number % 2 == 0 ? "EVEN" : "ODD";
        printResult(String.format("The number is %s", result));
    }


    /*
     * 8. The "Store" program displays a menu of three products with prices.
     * The user selects a product and enters the amount of money.
     * If the amount is less than the price, display the message: "Not enough money!",
     * if the amount equals the price, display: "Thank you for your purchase!",
     * if the amount is greater, display: "Your change: [change amount]".
     */
    void runStoreApp() throws IOException {
        //printTable(store);
        File htmlFile = new File("src/main/java/store.html");
        Desktop.getDesktop().browse(htmlFile.toURI());
    }

}