public class Task {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void execute() {
        System.out.println("Executing task: " + taskName);
    }
}
