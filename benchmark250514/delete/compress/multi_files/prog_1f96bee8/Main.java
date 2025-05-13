import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Set up gzip configuration
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.setGzipFlags(1);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Display course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }

        // Retrieve and display gzip flags
        /* read */ int flags = gzipConfig.getGzipFlags();
        System.out.println("Gzip Flags: " + flags);
    }
}