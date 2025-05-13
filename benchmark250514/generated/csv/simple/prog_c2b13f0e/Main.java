import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter with the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write a record with a comment
            /* write */ printer.printComment("This is a comment");
            
            // Flush and close the printer
            printer.flush();
            printer.close();
            
            // Parse the written CSV content
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}