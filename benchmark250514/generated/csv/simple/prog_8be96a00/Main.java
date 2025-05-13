import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format object with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Create a StringWriter to hold the CSV data
            StringWriter writer = new StringWriter();
            
            // Write data with a comment using CSVPrinter
            try (CSVPrinter printer = new CSVPrinter(writer, format)) {
                printer.printComment("This is a comment");
                printer.printRecord("Column1", "Column2");
            }
            
            // Read the CSV data
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            
            // Parse the CSV data and read the comment
            Iterable<CSVRecord> records = format.parse(reader);
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                    break; // Ensure the read operation is performed only once
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}