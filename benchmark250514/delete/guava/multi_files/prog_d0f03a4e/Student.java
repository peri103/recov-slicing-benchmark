public class Student {
    private String name;
    private StudentScores scores;

    public Student(String name) {
        this.name = name;
        this.scores = new StudentScores();
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public String getName() {
        return name;
    }

    public StudentScores getScores() {
        return scores;
    }
}
