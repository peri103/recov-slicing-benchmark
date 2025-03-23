import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExecutorServiceManager executorServiceManager = new ExecutorServiceManager();
        executorServiceManager.createExecutorService();

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));

        for (Task task : tasks) {
            task.execute();
        }

        /* read */ ExecutorService retrievedService = executorServiceManager.getExecutorService();
        System.out.println("Executor Service retrieved successfully: " + (retrievedService != null));
    }
}