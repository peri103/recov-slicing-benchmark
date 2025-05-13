import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize TarArchiveHandler
        TarArchiveHandler tarHandler = new TarArchiveHandler("dummyEntry");
        tarHandler.setUserName("testuser");

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 101);
        Course science = new Course("Science", 102);

        student.enrollInCourse(math);
        student.enrollInCourse(science);

        // Display student information
        System.out.println("Student: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Enrolled in: " + course.getCourseName() + " (Code: " + course.getCourseCode() + ")");
        }

        // Retrieve and display username from TarArchiveHandler
        /* read */ String username = tarHandler.getUserName();
        System.out.println("Retrieved username from TarArchiveEntry: " + username);
    }
}