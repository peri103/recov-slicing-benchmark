import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Computer Science");

        // Enroll students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Retrieve and print student names from the course
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Enrolled Student: " + student.getName());
        }

        // Additional unrelated operations
        int[] array = {5, 10, 15, 20};
        for (int number : array) {
            System.out.println("Array element: " + number);
        }
    }
}