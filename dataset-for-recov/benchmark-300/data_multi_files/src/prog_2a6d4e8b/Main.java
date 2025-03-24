import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Process some data
        student.processScore(95);
        course.addScore(88);

        // Retrieve and print the processed data
        LinkedBlockingQueue<Integer> studentQueue = student.getProcessedData();
        try {
            /* read */ int processedScore = studentQueue.take();
            System.out.println("Processed score: " + processedScore);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print course scores
        System.out.println("Course scores: " + course.getScores());
    }
}