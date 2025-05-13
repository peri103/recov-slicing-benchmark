import org.apache.commons.csv.CSVRecord;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CSVDataHandler csvHandler = new CSVDataHandler();
        csvHandler.initializeFormat();

        String csvData = "# This is a comment\nName, Age\nJohn Doe, 30";
        csvHandler.parseCSVData(csvData);

        CommentRetriever commentRetriever = new CommentRetriever();

        for (Map.Entry<String, Integer> entry : csvHandler.getNameAgeMap().entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Assuming we have access to a CSVRecord object somehow
        CSVRecord dummyRecord = null; // This would be replaced by a real CSVRecord object
        if (dummyRecord != null) {
            String comment = commentRetriever.retrieveComment(dummyRecord);
            System.out.println("Comment: " + comment);
        }

        // Additional logic: calculate average age
        int totalAge = 0;
        for (int age : csvHandler.getNameAgeMap().values()) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) csvHandler.getNameAgeMap().size();
        System.out.println("Average Age: " + averageAge);
    }
}