package tasks;

import java.util.Arrays;

public class LoopTasks implements IPrint {
    /*
     * Loops:
     */

    /*
     * 1. Print the multiplication table for 4 in the console.
     */
    private void printMultiplicationTable(int forNumber, int upToLimit) {
        printMessage(String.format("Multiplication Table of %d (up to %d)", forNumber, upToLimit));
        for(int i = 0; i <= upToLimit; i ++ ) {
            int result = forNumber * i;
            System.out.printf("%d * %d = %d%n", forNumber, i, result);
        }
    }

    void printMultiplicationTable(int[] inputs) {
        if (inputs.length == 2) {
            printMultiplicationTable(inputs[0], inputs[1]);
        } else {
            printError(Error.ERROR_INVALID.get());
        }
    }


    /*
     * 2. The user enters a number (x). Display all even numbers from zero to x in the console.
     */
    void printEvenNumbersUpTo(int number) {
        for (int i = 0; i <= number; i += 2) {
            System.out.printf("%d  ", i);
        }
        System.out.println();
    }

    /*
     * 3. The user enters a number (x). Output the Fibonacci number at index x.
     */
    void getFibonacciNumberAtIndex(int index) {
        if(index > 46) {
            printError(Error.ERROR_OUT_OF_INT.get());
            return;
        }
        int[] fibonacciSequence = new int[index + 1];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        for (int i = 2; i < fibonacciSequence.length; i ++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        System.out.println(Arrays.toString(fibonacciSequence));

        printResult(String.format("The Fibonacci number at index %d is %d",
                fibonacciSequence.length - 1, fibonacciSequence[fibonacciSequence.length - 1])
        );
    }


    /*
     * 4. The user enters a number. Output the factorial of that number in the console.
     */
    void calculateFactorial(int n) {
        int factorial = 1;

        while (n >= 1) {
            factorial *= n;
            n --;
        }

        printResult(String.format("The factorial of number %d is %d", n, factorial));
    }


    /*
     * 5. The user enters a string. Output the string character by character (one character per line).
     */
    void printChars(String input) {
        char[] chars = input.toCharArray();
        for(char symbol :  chars) {
            System.out.println(symbol);
        }
    }
}