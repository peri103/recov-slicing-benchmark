import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter with a specified format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using the CSVPrinter
            /* write */ printer.printComment("This is a comment");
            
            // Flush the printer to ensure all data is written to the writer
            printer.flush();
            
            // Retrieve the output as a string
            String csvOutput = writer.toString();
            
            // Parse the CSV output to retrieve the comment
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).iterator().next();
            
            // Read the comment from the CSVRecord
            /* read */ String comment = record.getComment();
            
            // Print the comment to verify the result
            System.out.println(comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}