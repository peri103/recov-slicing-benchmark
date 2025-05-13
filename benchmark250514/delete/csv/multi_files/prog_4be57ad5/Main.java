import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormatWrapper and configure it
        CSVFormatWrapper formatWrapper = new CSVFormatWrapper();
        formatWrapper.configureFormat();

        // Create CSVRecordWrapper using the configured format
        CSVRecordWrapper recordWrapper = new CSVRecordWrapper(formatWrapper);

        // Check if the first column is set
        boolean isSet = recordWrapper.isColumnSet(0);
        System.out.println("Is column 0 set: " + isSet);

        // Demonstrate the use of Student class
        Student student = new Student("John Doe");
        student.addScore("Math", 95);
        student.addScore("Science", 89);

        // Print student scores
        Map<String, Integer> studentScores = student.getScores();
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}