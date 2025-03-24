import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        try {
            // Create a course and add students
            Course course = new Course("Computer Science");
            course.addStudent(new Student("Alice", 20));
            course.addStudent(new Student("Bob", 21));

            // Process data
            processor.processData(100);

            // Consume data
            int value = consumer.consumeData();
            System.out.println("Consumed value: " + value);

            // Print course details
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}