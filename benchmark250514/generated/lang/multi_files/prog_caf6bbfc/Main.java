import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Computer Science");

        // Create students and add them to the course
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        course.addStudent(student1);
        course.addStudent(student2);

        // Set byte value for student1
        student1.setByteValue((byte) 10);

        // Perform operations on students
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
        }

        // Read byte value from student1
        /* read */ byte value = student1.getByteValue();
        System.out.println("Byte Value for Alice: " + value);
    }
}