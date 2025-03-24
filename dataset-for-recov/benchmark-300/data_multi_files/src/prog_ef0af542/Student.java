public class Student {
    private String name;
    private PriorityQueueManager queueManager = new PriorityQueueManager();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        queueManager.addToQueue(score);
    }

    public PriorityQueue<Integer> getScores() {
        return queueManager.getQueue();
    }
}
