import java.util.Random;

public class TaskManager {
    private TaskQueue taskQueue = new TaskQueue();
    private Random random = new Random();

    public void generateTasks() {
        for (int i = 0; i < 10; i++) {
            taskQueue.addTask(random.nextInt(100));
        }
    }

    public void processTasks() {
        while (true) {
            int task = taskQueue.getNextTask();
            if (task == 0) break; // Assuming 0 is a sentinel value
            System.out.println("Processing task: " + task);
        }
    }
}
