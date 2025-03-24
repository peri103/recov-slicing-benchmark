import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student("Alice");
            Random random = new Random();

            // Add some unrelated code to make the program more complex
            for (int i = 0; i < 5; i++) {
                int randomValue = random.nextInt(100);
                student.addScore(randomValue);
            }

            // Perform the write operation
            student.addScore(42);

            // Add more unrelated code
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += random.nextInt(100);
            }

            // Perform the read operation
            int value = student.getScore();
            System.out.println("Value read from deque: " + value);

            // Print some additional information
            System.out.println("Sum of random values: " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}