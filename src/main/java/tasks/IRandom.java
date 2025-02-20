package tasks;

import java.util.Arrays;
import java.util.Random;

interface IRandom extends IPrint {

    Random random = new Random();

    private int generateInt() {
        int randomNumber = random.nextInt();
        while(randomNumber > 100 || randomNumber < -100) {
            randomNumber /= 10;
        }

        return randomNumber;
    }

    default int[] generateIntArray() {
        int[] array = new int[Math.abs(generateInt())];
        for(int i = 0; i < array.length; i ++) {
            array[i] = generateInt();
        }
        System.out.println("\n" + Arrays.toString(array));

        return array;
    }

    default int[][] generate2DIntArray(int dimension) {
        int[][] array = new int[dimension][dimension];
        for(int i = 0; i < dimension; i ++) {
            for (int j = 0; j < dimension; j ++) {
                array[i][j] = generateInt();
            }
        }
        print2DArray(array);

        return array;
    }
}