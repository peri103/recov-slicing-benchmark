public class Student {
    private String name;
    private LinkedListHandler scoresHandler = new LinkedListHandler();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scoresHandler.addFirstElement(score);
    }

    public int getFirstScore() {
        return scoresHandler.getFirstElement();
    }

    public int getNumberOfScores() {
        return scoresHandler.getSize();
    }
}
