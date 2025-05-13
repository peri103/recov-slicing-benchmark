import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter out = new StringWriter();
            
            // Create a CSVPrinter instance using a basic CSV format
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);
            
            // Write a comment using the printComment method
            /* write */ printer.printComment("This is a comment");
            
            // Flush the printer to ensure all data is written to the StringWriter
            printer.flush();
            
            // Retrieve the CSV data as a string
            String csvData = out.toString();
            
            // Simulate reading the CSV data by parsing it into CSVRecord objects
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();
            
            // Assuming the comment is associated with the first record
            CSVRecord record = records.get(0);
            
            // Read the comment using the getComment method
            /* read */ String comment = record.getComment();
            
            // Output the read comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}