import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));
            
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();  // Ensure all data is written to the StringWriter
            
            // Read the written comment using CSVRecord
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            
            CSVRecord firstRecord = records.iterator().next();
            /* read */ String comment = firstRecord.getComment();
            
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}