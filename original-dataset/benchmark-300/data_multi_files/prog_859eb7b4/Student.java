public class Student {
    private String name;
    private PriorityQueueOperations queueOperations = new PriorityQueueOperations();

    public Student(String name) {
        this.name = name;
    }

    public void addToQueue(int value) {
        queueOperations.addToQueue(value);
    }

    public PriorityQueue<Integer> getQueue() {
        return queueOperations.getQueue();
    }
}
