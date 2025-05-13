import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize DateManipulator
        DateManipulator dateManipulator = new DateManipulator(new Date());
        dateManipulator.addYearsToDate(5);

        // Create students and courses
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        course1.addStudent(student1);
        course2.addStudent(student2);

        // Print student and course information
        System.out.println("Student: " + student1.getName() + ", Enrolled in: " + student1.getCourses().get(0).getCourseName());
        System.out.println("Student: " + student2.getName() + ", Enrolled in: " + student2.getCourses().get(0).getCourseName());

        // Get and print the truncated date
        Date truncatedDate = dateManipulator.getTruncatedDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Truncated Date: " + dateFormat.format(truncatedDate));
    }
}