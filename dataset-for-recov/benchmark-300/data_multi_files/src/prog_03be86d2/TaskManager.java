public class TaskManager {
    private TaskQueue taskQueue = new TaskQueue();

    public void assignTask(int task) {
        taskQueue.addTask(task);
    }

    public int processNextTask() {
        return taskQueue.getNextTask();
    }
}
