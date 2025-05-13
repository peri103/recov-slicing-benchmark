import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Configure CSVFormat with additional settings
            format = format.withQuoteMode(QuoteMode.ALL).withHeader("name", "age");

            // Create a sample CSV content with a comment
            String csvContent = "# This is a comment\nname,age\nJohn,30\nDoe,25";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(csvContent, format);
            List<CSVRecord> records = parser.getRecords();

            // Process each record and calculate the average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : records) {
                if (!record.getComment().startsWith("#")) {
                    String ageStr = record.get("age");
                    totalAge += Integer.parseInt(ageStr);
                    count++;
                }
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first line
            /* read */ String comment = records.get(0).getComment();
            
            // Output the comment
            System.out.println("CSV Comment: " + comment);

            // Add more complexity by manipulating record data
            for (CSVRecord record : records) {
                String name = record.get("name");
                System.out.println("Processing record for: " + name);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}