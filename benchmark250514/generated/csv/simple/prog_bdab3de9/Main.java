import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(';');
            
            // Prepare a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write data using the CSVFormat
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            
            // Write a record to the CSVPrinter
            csvPrinter.printRecord(Arrays.asList("Alice", "Bob", "Charlie"));
            
            // Close the printer to flush data to the writer
            csvPrinter.close();
            
            // Read the CSV data as a string
            String csvData = writer.toString();
            
            // Parse the CSV data to a CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
            
            // Read the CSVRecord as a string
            /* read */ String recordString = record.toString();
            
            // Print the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}