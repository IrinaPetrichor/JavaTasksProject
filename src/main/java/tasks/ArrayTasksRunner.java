package tasks;

public class ArrayTasksRunner implements IScan, IRandom {

    public void runArrayTasks() {

        ArrayTasks task = new ArrayTasks();

        //1
        Utils.printTaskNumber();
        task.countPositiveAndNegativeNumbers(generateIntArray());

        //2
        Utils.printTaskNumber();
        task.sumEvenIndexedElements(generateIntArray());

        //3
        Utils.printTaskNumber();
        task.sumEvenElements(generateIntArray());

        //4
        Utils.printTaskNumber();
        task.findMaxElement(generateIntArray());

        //5
        Utils.printTaskNumber();
        task.findMostFrequentElement(generateIntArray());

        //6
        Utils.printTaskNumber();
        task.printDiagonalElements(generate2DIntArray(10));

        //7
        Utils.printTaskNumber();
        task.printReverseDiagonal(generate2DIntArray(10));

        //8
        Utils.printTaskNumber();
        task.findMaxColumnSum(generate2DIntArray(5));
    }
}