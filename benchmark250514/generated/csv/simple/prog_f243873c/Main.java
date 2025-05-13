import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ printer.printComment("This is a comment");
            
            // Flush the printer to ensure all data is written to the writer
            printer.flush();
            
            // Read the written content using CSVRecord
            StringReader reader = new StringReader(writer.toString());
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            
            // Assuming the comment is associated with the first record
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
                break; // Ensure the read operation is executed only once
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}