import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Manage archive entry
        ArchiveEntryManager manager = new ArchiveEntryManager("example.txt");
        manager.setLastModifiedTime(1625097600000L);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Display student information
        ArrayList<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println(student.getName() + " is " + student.getAge() + " years old.");
        }

        // Retrieve and display last modified time
        /* read */ long retrievedLastModifiedTime = manager.getLastModifiedTime();
        System.out.println("Last Modified Time: " + retrievedLastModifiedTime);
    }
}