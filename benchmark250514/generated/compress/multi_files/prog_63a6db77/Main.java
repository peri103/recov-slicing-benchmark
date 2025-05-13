import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new ArchiveEntryManager and set the entry size
        ArchiveEntryManager archiveManager = new ArchiveEntryManager("testEntry");
        archiveManager.setEntrySize(1024L);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Display course students
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Read the entry size
        /* read */ long size = archiveManager.getEntrySize();
        System.out.println("Size of CpioArchiveEntry: " + size);
    }
}