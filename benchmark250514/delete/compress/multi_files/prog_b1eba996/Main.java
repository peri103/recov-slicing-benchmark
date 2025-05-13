import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Setup Gzip configuration
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.setFlags(123);

        // Create students and a course
        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 22);

        Course javaCourse = new Course("Java Programming");
        javaCourse.enrollStudent(alice);
        javaCourse.enrollStudent(bob);

        // Print enrolled students
        List<Student> students = javaCourse.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Read the flags from the Gzip configuration
        /* read */ int flags = gzipConfig.getFlags();
        System.out.println("Flags set in GzipParameters: " + flags);

        // Perform a simple computation using the flags
        int numberOfStudents = students.size();
        int computationResult = numberOfStudents * flags;
        System.out.println("Result of computation using flags and number of students: " + computationResult);
    }
}