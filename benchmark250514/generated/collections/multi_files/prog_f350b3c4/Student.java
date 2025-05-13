public class Student {
    private String name;
    private LinkedMapOperations scores = new LinkedMapOperations();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        scores.addEntry(subject, score);
    }

    public int getScore(String subject) {
        return scores.getEntry(subject);
    }

    public void printScores() {
        scores.printEntries();
    }
}
