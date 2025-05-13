import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a Course and enroll Students
        Course course = new Course("Computer Science");
        course.enrollStudent(new Student("Alice", 20));
        course.enrollStudent(new Student("Bob", 22));

        // Create GzipParametersWrapper and set flags
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        gzipWrapper.setFlags(2);

        // Retrieve and print enrolled students
        ArrayList<Student> students = course.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Get flags from GzipParametersWrapper
        /* read */ int flags = gzipWrapper.getFlags();
        System.out.println("Flags: " + flags);
    }
}