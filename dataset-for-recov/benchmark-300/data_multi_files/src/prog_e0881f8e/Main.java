import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        
        // Create a student and course
        Student student = new Student("Alice", 20);
        Course course = new Course("Computer Science");
        course.addStudent(student);
        
        // Write thread
        Thread writer = new Thread(() -> {
            try {
                queueManager.putValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start write thread
        writer.start();
        
        // Additional complex code
        System.out.println("Course: " + course.getCourseName());
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
        
        // Read thread
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queueManager.takeValue();
                System.out.println("Value from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start read thread
        reader.start();
        
        // Wait for threads to finish
        writer.join();
        reader.join();
    }
}