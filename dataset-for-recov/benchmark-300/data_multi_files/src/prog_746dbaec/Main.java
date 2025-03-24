import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Random random = new Random();
        HashSet<Integer> randomScores = new HashSet<>();

        // Generate random scores
        for (int i = 0; i < 5; i++) {
            int randomScore = random.nextInt(100);
            randomScores.add(randomScore);
            student.addScore(randomScore);
        }

        // Add a specific score
        student.addScore(85);

        // Print all scores
        System.out.println("All scores:");
        for (Integer score : student.getScores()) {
            System.out.println(score);
        }

        // Check if the specific score exists
        /* read */ boolean containsScore = student.hasScore(85);
        System.out.println("Does the student have a score of 85? " + containsScore);

        // Perform some unrelated operations
        int sum = 0;
        for (Integer score : student.getScores()) {
            sum += score;
        }
        System.out.println("Total sum of scores: " + sum);

        // Remove some scores
        student.getScores().remove(85);
        student.getScores().removeAll(randomScores);

        // Print the final state of the scores
        System.out.println("Final scores:");
        for (Integer score : student.getScores()) {
            System.out.println(score);
        }
    }
}