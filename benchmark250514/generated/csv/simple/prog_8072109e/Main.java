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
            
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Use CSVPrinter to write data using the specified format
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            csvPrinter.printRecord(Arrays.asList("value1", "value2", "value3"));
            csvPrinter.flush();
            
            // Read the output using CSVRecord
            String csvOutput = writer.toString();
            CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords().get(0);
            
            // Print the CSVRecord using the toString method
            /* read */ String recordString = csvRecord.toString();
            System.out.println(recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}