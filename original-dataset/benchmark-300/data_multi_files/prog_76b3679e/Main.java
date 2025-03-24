import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Random random = new Random();

        // Add some random scores to the student
        for (int i = 0; i < 10; i++) {
            int score = random.nextInt(100);
            student.addScore(score);
        }

        // Add a specific score
        student.addScore(42);

        // Check if the specific score exists
        /* read */ boolean hasScore = student.hasScore(42);
        System.out.println("Student has score 42: " + hasScore);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(100);
        }
        System.out.println("Sum of random numbers: " + sum);
    }
}