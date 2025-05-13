import org.apache.commons.collections4.map.LinkedMap;

public class Courses {
    private LinkedMap<String, Integer> courseGrades = new LinkedMap<>();

    public void addCourse(String courseName, int grade) {
        /* write */ courseGrades.put(courseName, grade);
    }

    public int getGrade(String courseName) {
        /* read */ return courseGrades.get(courseName);
    }

    public LinkedMap<String, Integer> getAllCourses() {
        return courseGrades;
    }
}
