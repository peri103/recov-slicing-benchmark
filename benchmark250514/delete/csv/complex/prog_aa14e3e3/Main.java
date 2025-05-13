import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;

        // Simulate a CSVRecord with comment
        List<String> recordValues = Arrays.asList("value1", "value2");
        CSVRecord record = new CSVRecord(null, recordValues, null, 0, "This is a comment");

        // Create an ArrayList to hold CSVRecords
        ArrayList<CSVRecord> recordsList = new ArrayList<>();
        recordsList.add(record);

        // Manipulate the recordsList
        for (CSVRecord rec : recordsList) {
            // Print each record's values
            System.out.println(rec.toMap());
        }

        // Add more CSVRecords to the list
        CSVRecord record2 = new CSVRecord(null, Arrays.asList("value3", "value4"), null, 1, "Another comment");
        recordsList.add(record2);

        // Process the recordsList
        for (CSVRecord rec : recordsList) {
            System.out.println("Processing record: " + rec.toMap());
        }

        // Modify the format with header comments
        /* write */ format = format.withHeaderComments("This is a comment");

        // Further processing of records
        for (CSVRecord rec : recordsList) {
            if (rec.getRecordNumber() == 0) {
                /* read */ String comment = rec.getComment();
                System.out.println("Comment of first record: " + comment);
            }
        }

        // Additional logic to make the program more complex
        for (int i = 0; i < recordsList.size(); i++) {
            System.out.println("Record number: " + recordsList.get(i).getRecordNumber());
        }

        // Final manipulation on the list
        recordsList.remove(0);
        System.out.println("List size after removal: " + recordsList.size());
    }
}