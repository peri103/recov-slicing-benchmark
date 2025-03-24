import java.util.Random;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Course course = new Course("Computer Science");
        Random random = new Random();

        // Add students to the course
        for (int i = 1; i <= 5; i++) {
            course.addStudent(new Student("Student " + i, random.nextInt(100)));
        }

        // Use a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                queueManager.writeValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Perform some unrelated operations
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + " - Score: " + student.getScore());
        }

        // Perform the read operation in the main thread
        try {
            int value = queueManager.readValue();
            System.out.println("Value read from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated operations
        int totalScore = 0;
        for (Student student : course.getStudents()) {
            totalScore += student.getScore();
        }
        System.out.println("Total score of all students: " + totalScore);
    }
}