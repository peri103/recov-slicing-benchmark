public class Student {
    private String name;
    private QueueOperations queueOperations = new QueueOperations();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        queueOperations.addValue(score);
    }

    public Integer getScore() {
        return queueOperations.getValue();
    }
}
