import java.util.List;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void addScore(int score) {
        course.addStudentScore(this.name, score);
    }

    public List<Integer> getScores() {
        return course.getStudentScores(this.name);
    }

    public String getName() {
        return name;
    }
}
