import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Computer Science");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add grades to students
        alice.addGrade(90);
        bob.addGrade(85);

        // Add students to course
        course.addStudent(alice);
        course.addStudent(bob);

        // Display student information
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }

        // Work with compressed data
        CompressedData compressedData = new CompressedData("example.txt");
        compressedData.setCompressedSize(1024);

        // Perform some unrelated computations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read compressed size
        /* read */ long compressedSize = compressedData.getCompressedSize();
        System.out.println("Compressed size: " + compressedSize);
    }
}