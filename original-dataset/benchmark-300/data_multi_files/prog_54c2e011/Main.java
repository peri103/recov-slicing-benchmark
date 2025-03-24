import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student student = new Student("Alice");
        List<Integer> scores = new ArrayList<>();
        
        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            scores.add(i * 10);
        }
        
        // Perform the write operation
        student.addScore(100);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("Sum of scores: " + sum);
        
        // Perform the read operation
        /* read */ int value = student.getScore();
        System.out.println("Score read from student: " + value);
        
        // Add more unrelated operations
        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("World");
        for (String message : messages) {
            System.out.println(message);
        }
    }
}