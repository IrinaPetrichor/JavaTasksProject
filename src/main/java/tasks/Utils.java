package tasks;

class Utils {

    private static int taskNumber = 1;

    static void printTaskNumber() {
        System.out.println();
        System.out.printf("============= Task %d =============%n", taskNumber);
        taskNumber ++;
    }

    static int[] getZeroPosNegCounts(int[] array) {
        int countNegatives = 0;
        int countPositives = 0;
        int countZeros = 0;

        for (int number : array) {
            if (number > 0) countPositives++;
            if (number < 0) countNegatives++;
            if (number == 0) countZeros++;
        }

        return new int[]{countZeros, countPositives, countNegatives};
    }
}