import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance with default CSVFormat
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Create a list to store records
            List<String> additionalData = new ArrayList<>();
            additionalData.add("extra1");
            additionalData.add("extra2");
            additionalData.add("extra3");
            
            // Write a record to the CSVPrinter
            /* write */ printer.printRecord("value1", "value2", "value3");
            
            // Write additional records
            printer.printRecord(additionalData);
            printer.printRecord("another1", "another2", "another3");
            
            // Flush the CSVPrinter to ensure all data is written to the StringWriter
            printer.flush();
            
            // Prepare a StringReader to read the CSV data
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV data using CSVParser
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT);
            
            // Process all CSV records
            List<CSVRecord> records = parser.getRecords();
            for (int i = 0; i < records.size(); i++) {
                CSVRecord record = records.get(i);
                for (int j = 0; j < record.size(); j++) {
                    System.out.print(record.get(j) + " ");
                }
                System.out.println();
            }
            
            // Read the first CSVRecord from the parser
            CSVRecord firstRecord = records.get(0);
            
            // Retrieve a value from the first CSVRecord
            /* read */ String value = firstRecord.get(0);
            
            // Print the retrieved value
            System.out.println("Retrieved value: " + value);
            
            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}