import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryHandler archiveHandler = new ArchiveEntryHandler("exampleName");
        
        // Create some students
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
        }

        // Retrieve the name from the CpioArchiveEntry
        CpioArchiveEntry entry = archiveHandler.getEntry();
        /* read */ String name = entry.getName();
        System.out.println("Archive Entry Name: " + name);
    }
}