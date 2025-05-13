import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        
        // Add scores for different courses
        student.addScore("Math", 95);
        student.addScore("Science", 88);
        student.addScore("History", 76);

        // Fetch and print scores
        int mathScore = student.getScore("Math");
        System.out.println("Math Score: " + mathScore);

        int scienceScore = student.getScore("Science");
        System.out.println("Science Score: " + scienceScore);

        int historyScore = student.getScore("History");
        System.out.println("History Score: " + historyScore);

        // Calculate average
        List<Integer> scores = new ArrayList<>();
        scores.add(mathScore);
        scores.add(scienceScore);
        scores.add(historyScore);

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = total / (double) scores.size();
        System.out.println("Average Score: " + average);
    }
}