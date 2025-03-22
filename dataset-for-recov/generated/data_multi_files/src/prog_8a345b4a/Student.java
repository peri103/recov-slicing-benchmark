import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> completedCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void completeCourse(String courseName) {
        completedCourses.add(courseName);
    }

    public ArrayList<String> getCompletedCourses() {
        return completedCourses;
    }

    public String getName() {
        return name;
    }
}
