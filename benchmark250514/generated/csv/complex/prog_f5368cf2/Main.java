import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Create a sample CSV string
            String csvData = "Name,Age\nJohn,30\nDoe,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Perform some unrelated operations to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
            }
            Collections.sort(names);
            System.out.println("Sorted names: " + names);

            // Perform additional operations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Total age: " + totalAge);

            // Retrieve the first record
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Comment: " + comment);

            // Do some more unrelated operations
            double averageAge = (double) totalAge / records.size();
            System.out.println("Average age: " + averageAge);

            // Further operations
            for (String name : names) {
                System.out.println("Name length: " + name.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}