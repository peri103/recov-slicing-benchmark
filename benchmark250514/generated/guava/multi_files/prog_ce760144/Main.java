import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a RangeSetOperations instance
        RangeSetOperations rangeOps = new RangeSetOperations();
        
        // Create a Student instance
        Student student = new Student("John");
        for (int i = 0; i < 10; i++) {
            student.addScore(i);
        }
        
        // Perform operations on the student's scores
        HashSet<Integer> studentScores = student.getScores();
        for (Integer score : studentScores) {
            if (score % 2 == 0) {
                System.out.println("Student's even score: " + score);
            }
        }
        
        // Calculate the total score of the student
        int totalScore = student.calculateTotalScore();
        System.out.println("Total score of the student: " + totalScore);
        
        // Check if the range set contains the number 5
        boolean containsValue = /* read */ rangeOps.contains(5);
        
        // Print the result
        System.out.println("Does the range set contain the number 5? " + containsValue);
    }
}