package tasks;

import java.io.IOException;

public class IfElseTasksRunner implements IScan{

    public void runIfElseTasks() throws IOException {
        //IfElse

        IfElseTasks task = new IfElseTasks();

        //1
        task.isLessOrMore(processOneInput("Enter a number to compare it with 10."));

        //2
        task.compareNumbers(processTwoInputs("Enter two numbers to compare them."));

        //3
        task.identifyTriangleType(processThreeInputs("Enter the lengths of the sides of a triangle (three numbers)."));

        //4
        task.calculatePositivesAndNegatives(processFourInputs("Enter four numbers to analyze positive and negative entries."));

        //5
        task.findMax(processThreeInputs("Enter three numbers to find the maximum value."));

        //6
        task.sumMinMaxNumbers(processThreeInputs("Enter three numbers to calculate the sum of the max and min."));

        //7
        task.isEvenOrOdd(processOneInput("Enter a number to analyze if it is even or odd."));

        //8
        task.runStoreApp();
    }
}