import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Create a course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Display enrolled students
        List<Student> students = course.getEnrolledStudents();
        for (Student student : students) {
            System.out.println("Enrolled Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Use BiMapHandler to manage key-value pairs
        BiMapHandler biMapHandler = new BiMapHandler();
        biMapHandler.addEntry("key", 42);

        // Perform additional operations
        int totalAge = 0;
        for (Student student : students) {
            totalAge += student.getAge();
        }
        System.out.println("Total age of students: " + totalAge);

        // Retrieve value from BiMap
        /* read */ Integer value = biMapHandler.getEntry("key");
        System.out.println("Value retrieved from biMap: " + value);
    }
}