import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager("testEntry");
        manager.setEntryMode(777);

        // Create a course and students
        Course course = new Course("Computer Science");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add grades for students
        alice.addGrade(85);
        alice.addGrade(90);
        bob.addGrade(75);
        bob.addGrade(80);

        // Enroll students in the course
        course.enrollStudent(alice);
        course.enrollStudent(bob);

        // Display student grades
        for (Student student : course.getStudents()) {
            System.out.println("Grades for " + student.getName() + ": " + student.getGrades());
        }

        // Retrieve and print the mode set in the archive entry
        /* read */ int mode = manager.getEntryMode();
        System.out.println("Mode set in the archive entry: " + mode);
    }
}