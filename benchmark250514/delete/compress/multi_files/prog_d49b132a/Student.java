public class Student {
    private String name;
    private int studentId;
    private StudentScores scores = new StudentScores();

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public StudentScores getScores() {
        return scores;
    }
}
