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
            
            // Create a CSVFormat instance and set header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            
            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Print some records
            printer.printRecord("Header1", "Header2");
            printer.printRecord("Value1", "Value2");
            
            // Close the printer to flush the content
            printer.close();
            
            // Read the CSV output into a list of CSVRecord
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Retrieve and print the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}