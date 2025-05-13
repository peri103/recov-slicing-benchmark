import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance with default CSV format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using the CSVPrinter
            /* write */ printer.printComment("This is a comment");
            
            // Flush the printer to ensure all data is written to the writer
            printer.flush();
            
            // Read the comment using CSVRecord
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment to verify the operation
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}