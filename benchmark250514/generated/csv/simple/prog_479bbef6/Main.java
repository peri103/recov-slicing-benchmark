import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");
            
            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();
            
            // Read the comment using CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords().get(0);
            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}