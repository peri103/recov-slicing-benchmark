public class Student {
    private String name;
    private QueueManager queueManager = new QueueManager();

    public Student(String name) {
        this.name = name;
    }

    public void addValueToQueue(int value) {
        queueManager.addValue(value);
    }

    public int getValueFromQueue() {
        return queueManager.getValue();
    }
}
