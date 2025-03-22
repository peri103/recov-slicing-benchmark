import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a QueueHandler instance
            QueueHandler queueHandler = new QueueHandler();

            // Create a Student instance and add scores
            Student student = new Student("Bob");
            student.addScore(85);
            student.addScore(90);
            student.addScore(78);

            // Add a value to the queue using QueueHandler
            queueHandler.addValue(42);

            // Retrieve the value from the queue
            /* read */ int value = queueHandler.getValue();
            System.out.println("Value from queue: " + value);

            // Display student scores
            List<Integer> scores = student.getScores();
            System.out.println("Scores for " + student.getName() + ":");
            for (int score : scores) {
                System.out.println(score);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}