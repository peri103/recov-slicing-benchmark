import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        
        // Write data in a separate thread
        Thread writerThread = new Thread(() -> {
            processor.writeData(100);
        });
        
        // Read data in a separate thread
        Thread readerThread = new Thread(() -> {
            int data = processor.readData();
            System.out.println("Read data: " + data);
        });
        
        writerThread.start();
        readerThread.start();
        
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional code to make the program more complex
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}