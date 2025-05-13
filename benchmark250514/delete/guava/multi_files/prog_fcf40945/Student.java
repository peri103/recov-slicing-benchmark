import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public void addScore(String courseName, int score) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                course.addScore(name, score);
                break;
            }
        }
    }

    public ListMultimap<String, Integer> getScoresForCourse(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                return course.getStudentScores();
            }
        }
        return null;
    }
}
