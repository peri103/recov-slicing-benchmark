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
            
            // Create a CSVPrinter using the default format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a record to the CSVPrinter
            /* write */ printer.printRecord("value1", "value2", "value3");
            
            // Initialize another StringWriter for additional CSV operations
            StringWriter writer2 = new StringWriter();
            CSVPrinter printer2 = new CSVPrinter(writer2, CSVFormat.DEFAULT);
            
            // Write multiple records to the second CSVPrinter
            printer2.printRecord("extra1", "extra2", "extra3");
            printer2.printRecord("extra4", "extra5", "extra6");
            printer2.flush();
            
            // Parse the written CSV data into CSVRecords
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Perform operations on the second set of CSV records
            List<CSVRecord> records2 = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer2.toString())).getRecords();
            for (CSVRecord record : records2) {
                for (int i = 0; i < record.size(); i++) {
                    System.out.println("Extra Value: " + record.get(i));
                }
            }
            
            // Read the first value from the first record
            /* read */ String value = records.get(0).get(0);
            
            // Output the read value
            System.out.println(value);
            
            // Close the printers
            printer.close();
            printer2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}