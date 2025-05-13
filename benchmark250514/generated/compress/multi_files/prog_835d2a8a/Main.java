import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a DumpArchiveEntryWrapper and set mode
        DumpArchiveEntryWrapper entryWrapper = new DumpArchiveEntryWrapper();
        entryWrapper.setEntryMode(755);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // List all students in the course
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }

        // More computations
        int totalStudents = course.getStudents().size();
        System.out.println("Total students in " + course.getCourseName() + ": " + totalStudents);

        // Read the mode using the read method from DumpArchiveEntryWrapper
        /* read */ int mode = entryWrapper.getEntryMode();

        // Print the mode to verify the read operation
        System.out.println("Dump Archive Entry Mode: " + mode);
    }
}