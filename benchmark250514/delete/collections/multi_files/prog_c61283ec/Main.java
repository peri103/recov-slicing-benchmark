import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a new student and enroll them in a course
        Student student = new Student("Alice");
        student.enrollInCourse("Mathematics");
        
        // Create a new course and add the student
        Course course = new Course("Mathematics");
        course.addStudent(student);
        
        // Print the course details
        System.out.println("Course: " + course.getCourseName());
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName() + ", Enrolled in: " + s.getEnrolledCourse());
        }
        
        // Additional unrelated operations
        Map<String, Integer> scoreBoard = new HashMap<>();
        scoreBoard.put("Alice", 95);
        scoreBoard.put("Bob", 87);
        
        for (Map.Entry<String, Integer> entry : scoreBoard.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}