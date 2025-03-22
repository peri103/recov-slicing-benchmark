import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Working with DelayQueueManager
        DelayQueueManager delayQueueManager = new DelayQueueManager();
        DelayedElement element = new DelayedElement("Hello, World!", 5000); // 5 seconds delay
        delayQueueManager.addElement(element);

        // Working with Student class
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        System.out.println("Scores for " + student.getName() + ":");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Simulate delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Reading from the DelayQueue
        try {
            DelayedElement retrievedElement = delayQueueManager.retrieveElement();
            System.out.println("Retrieved element: " + retrievedElement.getData());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}