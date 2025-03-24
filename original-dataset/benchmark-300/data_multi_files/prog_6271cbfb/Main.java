import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Course course = new Course("Computer Science");

        // Adding students to the course
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        course.addStudent(new Student("Charlie", 21));

        // Processing data
        processor.processData(100);

        // Retrieving data
        BlockingQueue<Integer> queue = processor.getQueue();
        /* read */ int value = queue.take();
        System.out.println("Processed value: " + value);

        // Displaying course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}