public class Student {
    private String name;
    private DequeManager dequeManager = new DequeManager();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        dequeManager.addFirst(score);
    }

    public int getScore() throws InterruptedException {
        return dequeManager.takeFirst();
    }
}
