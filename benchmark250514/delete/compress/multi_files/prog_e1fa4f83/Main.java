import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryHandler archiveHandler = new ArchiveEntryHandler();
        archiveHandler.setEntryName("exampleName");

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(90);
        student1.addGrade(85);
        student2.addGrade(88);
        student2.addGrade(92);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }

        // Using the original read method
        CpioArchiveEntry entry = archiveHandler.getEntry();
        /* read */ String name = entry.getName();
        System.out.println("CpioArchiveEntry Name: " + name);
    }
}