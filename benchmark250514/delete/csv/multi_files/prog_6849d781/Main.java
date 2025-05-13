import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using CSVFormatHandler and CSVRecordSimulator
        CSVFormatHandler formatHandler = new CSVFormatHandler();
        formatHandler.configureFormat();
        CSVRecordSimulator recordSimulator = new CSVRecordSimulator(formatHandler);
        boolean isConsistent = recordSimulator.checkConsistency();
        System.out.println("Is CSV Record Consistent? " + isConsistent);

        // Working with Student class
        Student student = new Student("John Doe");
        student.addScore(85);
        student.addScore(90);
        student.addScore(78);

        System.out.println("Scores for " + student.getName() + ":");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Additional logic
        int total = 0;
        for (int score : student.getScores()) {
            total += score;
        }
        System.out.println("Total Score: " + total);
    }
}