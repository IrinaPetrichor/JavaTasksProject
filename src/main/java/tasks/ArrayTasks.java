package tasks;

import java.util.Arrays;

class ArrayTasks implements IPrint {

    /*
     * Arrays:
     */

    /*
     * 1. Given an array of integers. Output the count of positive and negative numbers in it.
     */
    void countPositiveAndNegativeNumbers(int[] array) {
        int[] counts = Utils.getZeroPosNegCounts(array);
        int countZeros = counts[0];
        int countPositives = counts[1];
        int countNegatives = counts[2];

        printResult(String.format(
                "Random array contains: %n\t%d zeros,%n\t%d positive numbers,%n\t%d negative numbers.",
                countZeros, countPositives, countNegatives
        ));
    }

    /*
     * 2. Given an array of integers. Output the sum of the elements at even indices.
     */
    void sumEvenIndexedElements(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i +=2 ) {
            sum += array[i];
        }

        printResult(String.format("The sum of the elements at even indices = %d", sum));
    }


    /*
     * 3. Given an array of integers. Output the sum of the even elements (even values).
     */
    void sumEvenElements(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        printResult(String.format("The sum of the even elements (even values): %d", sum));
    }


    /*
     *  4. Given an array of integers. Output the largest number in the array.
     */
    void findMaxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int number : array) {
            max = max > number ? max : number;
        }

        printResult("The largest number in the array is " + max);
    }

    /*
     * 5. Given an array of integers. Output the most frequent element.
     * If there are multiple, output the largest one.
     * If there are no duplicates, output an appropriate message.
     */

    void findMostFrequentElement(int[] array) {
        int count = 1;
        int max = 0;
        int[] result = new int[2];

        Arrays.sort(array);
        for(int i = 0; i < array.length - 1; i ++) {
            if (array[i] == array[i + 1]) {
                count ++;
            } else {
                if (max < count) {
                    result[0] = array[i];
                    result[1] = count;
                    max = count;
                }
                count = 1;
            }
        }

        System.out.println(Arrays.toString(result));

        if(result[1] == 1) {
            printResult("There are no duplicates in array.");
        } else {
            printResult(String.format("The most frequent element is %d, which appears %d times.", result[0], result[1]));
        }
    }


    /*
     * 6. Given a 10x10 two-dimensional array of integers.
     * Print all the numbers along the diagonal from [0][0] to [9][9].
     */
    void printDiagonalElements(int[][] array) {
        if(array.length == array[0].length) {
            for(int i = 0; i < array.length; i ++) {
                printResultIInLine(array[i][i] + " ");
            }
        } else {
            printResult(Error.ERROR_OUT_OF_SCOPE.get());
        }

        System.out.println();
    }


    /*
     * 7. Given a 10×10 two-dimensional array of integers,
     *    print all numbers along the diagonal from [0][9] to [9][0].
     */
    void printReverseDiagonal(int[][] array) {
        if(array.length == array[0].length) {
            for(int i = array.length - 1; i >= 0; i --) {
                printResultIInLine(array[array.length - 1 - i][i] + " ");
            }
        } else {
            printResult(Error.ERROR_OUT_OF_SCOPE.get());
        }

        System.out.println();
    }

    /*
     * 8. A 5x5 two-dimensional array with integers is given.
     * Calculate the sum of numbers in each column and output the largest sum.
     */
    void findMaxColumnSum(int[][] array) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i ++) {
            for(int j = 0; j < array[0].length; j ++) {
                sum += array[j][i];
            }
            maxSum = Math.max(maxSum, sum);
            sum = 0;
        }

        printResult(String.format("The largest sum of numbers of column's sums = %d", maxSum));
    }
}