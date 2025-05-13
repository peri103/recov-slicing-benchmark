import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance using a simple CSV format
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Use the write method to add a comment to the CSV
            /* write */ csvPrinter.printComment("This is a comment");
            
            // Flush and close the CSVPrinter to ensure all data is written
            csvPrinter.flush();
            csvPrinter.close();

            // Read the CSV content back using a CSVParser
            String csvContent = writer.toString();
            StringReader reader = new StringReader(csvContent);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);

            // Iterate through records to find and print the comment
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}