public class TaskManager {
    private TaskQueue taskQueue = new TaskQueue();

    public void addTask(int task) {
        taskQueue.addTask(task);
    }

    public Integer processNextTask() {
        return taskQueue.getNextTask();
    }
}
