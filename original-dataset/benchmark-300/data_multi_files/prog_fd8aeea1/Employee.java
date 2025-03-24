public class Employee {
    private String name;
    private TaskManager taskManager = new TaskManager();

    public Employee(String name) {
        this.name = name;
    }

    public void assignTask(int task) {
        taskManager.addTask(task);
    }

    public int completeNextTask() {
        return taskManager.getNextTask();
    }
}
