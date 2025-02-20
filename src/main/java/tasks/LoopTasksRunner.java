package tasks;

public class LoopTasksRunner implements IScan{

    public void runLoopTasks() {
        LoopTasks task = new LoopTasks();

        //1
        task.printMultiplicationTable(processTwoInputs("Enter a number and a limit to generate the Multiplication Table."));

        //2
        task.printEvenNumbersUpTo(processOneInput("Enter a number to display all even numbers up to it."));

        //3
        task.getFibonacciNumberAtIndex(processOneInput("Enter an index to get the Fibonacci number at that position."));

        //4
        task.calculateFactorial(processOneInput("Enter a positive number to calculate its factorial." ));

        //5
        task.printChars(processStringInput("Enter a string to print each character."));
    }
}