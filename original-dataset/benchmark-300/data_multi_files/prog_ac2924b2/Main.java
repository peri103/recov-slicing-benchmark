import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataWriter writer = new DataWriter(queue);
        DataReader reader = new DataReader(queue);

        // Create a student and course
        Student student = new Student("Alice", 20);
        Course course = new Course("Computer Science");
        course.addStudent(student);

        // Perform the write operation
        writer.writeData();

        // Perform some unrelated operations
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Number of students in course: " + course.getStudents().size());

        // Perform the read operation
        int value = reader.readData();
        System.out.println("Read value: " + value);
    }
}