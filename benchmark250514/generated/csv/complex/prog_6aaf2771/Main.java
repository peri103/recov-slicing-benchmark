import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a header comment
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withHeaderComments("This is a header comment");

        // Simulate CSV data
        String csvData = "# This is a header comment\nName,Age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Create a new list to store ages
            List<Integer> ages = new ArrayList<>();

            // Process CSV records
            for (CSVRecord record : records) {
                if (record.getRecordNumber() > 1) { // Skip header
                    String name = record.get("Name");
                    int age = Integer.parseInt(record.get("Age"));
                    ages.add(age);
                    System.out.println("Name: " + name + ", Age: " + age);
                }
            }

            // Calculate average age
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / ages.size();
            System.out.println("Average Age: " + averageAge);

            // Prepare new CSV data for output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withHeader("Name", "Age"));
            printer.printRecord("Alice", 28);
            printer.printRecord("Bob", 34);

            // Parse the new CSV data
            CSVParser newParser = CSVParser.parse(new StringReader(out.toString()), CSVFormat.DEFAULT.withHeader("Name", "Age"));
            List<CSVRecord> newRecords = newParser.getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Header Comment: " + comment);

            // Output new CSV records
            for (CSVRecord newRecord : newRecords) {
                String newName = newRecord.get("Name");
                String newAge = newRecord.get("Age");
                System.out.println("New Record - Name: " + newName + ", Age: " + newAge);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}