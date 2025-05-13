import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArchiveManager archiveManager = new ArchiveManager("example.txt", 100);
        archiveManager.updateSize(200);

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ long size = archiveManager.getSize();
        System.out.println("Archive entry size: " + size);
    }
}