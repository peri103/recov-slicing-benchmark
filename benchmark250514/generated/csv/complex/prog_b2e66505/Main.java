import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Additional complexity: Create a CSV printer and write some data
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("ID", "Name", "Age"));
            printer.printRecord(1, "Alice", 28);
            printer.printRecord(2, "Bob", 32);
            printer.flush();

            // Parse the newly created CSV data
            CSVParser newParser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withHeader());
            List<CSVRecord> newRecords = newParser.getRecords();

            // Process the new records
            for (CSVRecord newRecord : newRecords) {
                System.out.println("ID: " + newRecord.get("ID") + ", Name: " + newRecord.get("Name") + ", Age: " + newRecord.get("Age"));
            }

            // Read the comment from the original record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}