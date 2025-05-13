import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipConfig
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.configureOperatingSystem(3);

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20, course);
        Student student2 = new Student("Bob", 22, course);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print course and student details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Retrieve and print the configured operating system from GzipConfig
        /* read */ int operatingSystem = gzipConfig.getConfiguredOperatingSystem();
        System.out.println("Configured Operating System: " + operatingSystem);

        // Further operations with a HashMap for demonstration
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 1);
        map.put("Bob", 2);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}