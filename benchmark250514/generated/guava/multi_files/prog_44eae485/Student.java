public class Student {
    private String name;
    private StudentScores scores = new StudentScores();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public boolean hasScore(int score) {
        return scores.containsScore(score);
    }

    public String getName() {
        return name;
    }
}