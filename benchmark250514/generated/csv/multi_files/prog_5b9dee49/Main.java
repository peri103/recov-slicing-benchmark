import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // CSV Handling
            CSVHandler csvHandler = new CSVHandler();
            String csvData = "\"value1\",\"value2\",\"value3\"";
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Record Processing
            RecordProcessor processor = new RecordProcessor();
            processor.processRecords(records);

            // Get and print the first record string
            String recordString = processor.getFirstRecordString(records);
            System.out.println("Read record: " + recordString);

            // Student logic
            Student student = new Student("Bob");
            student.addScore(85);
            student.addScore(90);

            for (int score : student.getScores()) {
                System.out.println("Student score: " + score);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}