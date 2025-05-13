public class Student {
    private String name;
    private StudentScores scores = new StudentScores();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public int getScore(int index) {
        return scores.getScore(index);
    }

    public String getName() {
        return name;
    }
}
