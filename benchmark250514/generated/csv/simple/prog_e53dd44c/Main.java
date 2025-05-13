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
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write CSV data
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");
            
            // Flush and close the printer to finalize the output
            csvPrinter.flush();
            csvPrinter.close();
            
            // Parse the written CSV data to retrieve the comment
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the retrieved comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}