import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Physics");

        Course mathCourse = new Course("Mathematics", 3);
        Course physicsCourse = new Course("Physics", 4);

        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(mathCourse);
        courseList.add(physicsCourse);

        HashSet<String> enrolledCourses = new HashSet<>();
        enrolledCourses.add("Mathematics");
        enrolledCourses.add("Physics");

        HashMap<String, Integer> courseCredits = new HashMap<>();
        courseCredits.put(mathCourse.getCourseName(), mathCourse.getCredits());
        courseCredits.put(physicsCourse.getCourseName(), physicsCourse.getCredits());

        // Perform operations on courseList
        for (Course course : courseList) {
            System.out.println("Course: " + course.getCourseName() + ", Credits: " + course.getCredits());
        }

        // Perform operations on enrolledCourses
        for (String courseName : enrolledCourses) {
            System.out.println("Enrolled in: " + courseName);
        }

        // Perform operations on courseCredits
        int totalCredits = 0;
        for (String courseName : courseCredits.keySet()) {
            totalCredits += courseCredits.get(courseName);
        }
        System.out.println("Total Credits: " + totalCredits);

        // Read the first enrolled course
        String firstCourse = student.getCourses().getCourse(0);
        System.out.println("First enrolled course: " + firstCourse);
    }
}