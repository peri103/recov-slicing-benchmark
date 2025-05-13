import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
            
            // Additional complex operations
            List<String> additionalData = Arrays.asList("extra1", "extra2", "extra3");
            for (String data : additionalData) {
                csvPrinter.printRecord(data);
            }
            csvPrinter.flush();
            
            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);
            
            // Another CSV operation with different format
            CSVFormat anotherFormat = CSVFormat.EXCEL.withDelimiter(',');
            StringWriter anotherWriter = new StringWriter();
            CSVPrinter anotherCsvPrinter = new CSVPrinter(anotherWriter, anotherFormat);
            anotherCsvPrinter.printRecord(Arrays.asList("item1", "item2", "item3"));
            anotherCsvPrinter.flush();
            System.out.println("Another CSV output: " + anotherWriter.toString());
            
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