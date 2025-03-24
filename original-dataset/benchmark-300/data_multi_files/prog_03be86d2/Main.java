import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Random random = new Random();

        // Add some random scores to the student's queue
        for (int i = 0; i < 5; i++) {
            student.addScore(random.nextInt(100));
        }

        // Add the original write operation
        student.addScore(10);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += random.nextInt(100);
        }
        System.out.println("Sum of random numbers: " + sum);

        // Get the original read operation
        int score = student.getScore();
        System.out.println("Original read value: " + score);
    }
}