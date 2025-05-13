import java.util.List;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void addScore(int score) {
        course.addStudentScore(name, score);
    }

    public List<Integer> getScores() {
        return (List<Integer>) course.getStudentScores().get(name);
    }
}
