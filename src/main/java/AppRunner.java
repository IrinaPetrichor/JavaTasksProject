import tasks.ArrayTasksRunner;
import tasks.IfElseTasksRunner;
import tasks.LoopTasksRunner;

import java.io.IOException;

public class AppRunner{

    public static void main(String[] args) throws IOException {
        IfElseTasksRunner ifElseTasksRunner = new IfElseTasksRunner();
        ifElseTasksRunner.runIfElseTasks();

        LoopTasksRunner loopTasksRunner = new LoopTasksRunner();
        loopTasksRunner.runLoopTasks();

        ArrayTasksRunner arrayTasksRunner = new ArrayTasksRunner();
        arrayTasksRunner.runArrayTasks();
    }
}