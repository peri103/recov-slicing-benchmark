public class Student {
    private String name;
    private QueueManager queueManager = new QueueManager();

    public Student(String name) {
        this.name = name;
    }

    public void writeScore(int score) throws InterruptedException {
        queueManager.writeValue(score);
    }

    public int readScore() throws InterruptedException {
        return queueManager.readValue();
    }
}
