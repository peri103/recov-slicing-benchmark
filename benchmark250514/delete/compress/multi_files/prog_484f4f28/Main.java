import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create ArchiveManager and set size
        ArchiveManager archiveManager = new ArchiveManager();
        archiveManager.setArchiveSize(2048);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Retrieve and print archive size
        /* read */ long size = archiveManager.getArchiveSize();
        System.out.println("Archive Size: " + size);

        // Additional logic with numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);

        if (sum > size) {
            System.out.println("Sum is greater than the archive size.");
        } else {
            System.out.println("Sum is less than or equal to the archive size.");
        }
    }
}