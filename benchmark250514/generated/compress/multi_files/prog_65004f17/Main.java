import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using DumpArchiveHandler
        DumpArchiveHandler handler = new DumpArchiveHandler();
        handler.setEntryName("exampleName");

        // Create students and courses
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        course2.enrollStudent(student1);

        // Print enrolled students
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Students enrolled in " + course2.getCourseName() + ":");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        // Read the entry name from DumpArchiveHandler
        /* read */ String entryName = handler.getEntryName();
        System.out.println("DumpArchiveEntry name: " + entryName);
    }
}