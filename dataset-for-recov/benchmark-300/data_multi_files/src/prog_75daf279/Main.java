public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskManager taskManager = new TaskManager();
        DelayedElement task = new DelayedElement(1000); // 1 second delay

        taskManager.addTask(task);

        // Simulate some other operations
        System.out.println("Task added to the queue. Waiting for it to be processed...");

        /* read */ DelayedElement processedTask = taskManager.getNextTask();
        System.out.println("Processed task: " + processedTask);

        // Additional unrelated code
        System.out.println("Program completed.");
    }
}