public class Student {
    private String name;
    private StudentScores scores = new StudentScores();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public void addCourse(Course course) {
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }

    public StudentScores getScores() {
        return scores;
    }
}
