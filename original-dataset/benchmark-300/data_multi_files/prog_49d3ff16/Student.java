public class Student {
    private String name;
    private StackManager stackManager = new StackManager();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        stackManager.pushValue(score);
    }

    public int getScore() {
        return stackManager.peekValue();
    }
}
