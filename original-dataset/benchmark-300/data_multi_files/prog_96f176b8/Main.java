import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Course course = new Course("Computer Science");
        
        // Adding students to the course
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        
        // Processing data
        processor.processData(100);
        
        // Retrieving and printing student information
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
        
        // Reading the processed data
        LinkedBlockingQueue<Integer> queue = processor.getQueue();
        /* read */ int value = queue.take();
        System.out.println("Processed Data: " + value);
    }
}