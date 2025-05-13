import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveManager tarManager = new TarArchiveManager("initialName");
        tarManager.setEntryName("newName");

        Course course = new Course("Computer Science");
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);

        course.enrollStudent(alice);
        course.enrollStudent(bob);

        ArrayList<Student> students = course.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getId());
        }

        /* read */ String entryName = tarManager.getEntryName();
        System.out.println("TarArchiveEntry Name: " + entryName);
    }
}