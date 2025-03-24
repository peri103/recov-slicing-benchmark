import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Student student = new Student("Alice");

        // Adding scores to the student
        student.addScore(85);
        student.addScore(90);
        student.addScore(95);

        // Adding data to the processor
        processor.addData(42);

        // Retrieving and printing scores
        ArrayList<Integer> scores = student.getScores();
        for (Integer score : scores) {
            System.out.println("Student score: " + score);
        }

        // Retrieving data from the processor
        /* read */ Integer value = processor.getData();
        System.out.println("Value from processor: " + value);

        // Additional operations
        student.addScore(100);
        System.out.println("Updated scores:");
        for (Integer score : student.getScores()) {
            System.out.println("Student score: " + score);
        }
    }
}