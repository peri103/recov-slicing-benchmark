public class Student {
    private String name;
    private StudentScores scores;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.scores = new StudentScores();
        this.course = new Course("Mathematics");
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public int getScore() {
        return scores.getScore();
    }

    public String getCourseName() {
        return course.getName();
    }
}
