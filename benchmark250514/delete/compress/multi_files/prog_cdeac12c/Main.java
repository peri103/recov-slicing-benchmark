import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);

        // Create a course and enroll students
        Course course = new Course("Math 101");
        course.enrollStudent(alice);
        course.enrollStudent(bob);

        // Print enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Manage archive entry
        ArchiveManager archiveManager = new ArchiveManager("example.txt", 1000);
        archiveManager.setGroupName("developers");

        // Some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        // Read and print group name from archive entry
        String groupName = archiveManager.getGroupName();
        System.out.println("Archive Group Name: " + groupName);
    }
}