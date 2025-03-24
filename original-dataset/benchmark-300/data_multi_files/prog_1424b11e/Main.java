import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Adding scores to the student
        student.addScore(85);
        student.addScore(90);

        // Writing to the queue
        queueManager.writeToQueue(1);

        // Processing the student's scores
        for (Integer score : student.getScores()) {
            System.out.println(student.getName() + "'s score: " + score);
        }

        // Reading from the queue
        try {
            int value = queueManager.readFromQueue();
            System.out.println("Queue value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional operations
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Printing the final state of the ArrayList and LinkedList
        System.out.println("Final ArrayList: " + list);
        System.out.println("Final LinkedList: " + linkedList);
    }
}