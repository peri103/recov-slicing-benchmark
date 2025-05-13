import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            
            // Additional CSVFormat example with different settings
            CSVFormat format2 = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

            // Sample CSV data
            String csvData = "Name,Age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Unrelated operation on records to increase complexity
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                names.add(rec.get("Name"));
            }
            
            // Perform some operations with names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Separate unrelated logic
            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                sumOfAges += Integer.parseInt(rec.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Since we added a header comment, it is associated with the first record
            CSVRecord record = records.get(0);

            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

            // Additional unrelated logic to increase complexity
            int maxAge = 0;
            for (CSVRecord rec : records) {
                int age = Integer.parseInt(rec.get("Age"));
                if (age > maxAge) {
                    maxAge = age;
                }
            }
            System.out.println("Max age: " + maxAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}