import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Additional variables and logic to make the program more complex
        List<String> headers = Arrays.asList("Header1", "Header2", "Header3");
        List<List<String>> data = Arrays.asList(
            Arrays.asList("Row1Col1", "Row1Col2", "Row1Col3"),
            Arrays.asList("Row2Col1", "Row2Col2", "Row2Col3")
        );

        try {
            // Create a CSVPrinter with the specified format and headers
            /* write */ CSVPrinter printer = new CSVPrinter(writer, format.withEscape('\\').withHeader(headers.toArray(new String[0])));
            // Write multiple records to the CSV
            for (List<String> recordData : data) {
                printer.printRecord(recordData);
            }
            printer.flush();

            // Process the written CSV content
            String csvContent = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.withHeader(headers.toArray(new String[0])).parse(new java.io.StringReader(csvContent)).getRecords();
            
            // Additional processing on the records
            for (CSVRecord record : records) {
                System.out.println("Processing record: " + record);
                // Simulate some complex processing
                int sum = 0;
                for (int i = 0; i < record.size(); i++) {
                    sum += record.get(i).length();
                }
                System.out.println("Sum of lengths of fields: " + sum);
            }

            // Read the first written record
            CSVRecord firstRecord = records.get(0);
            /* read */ String recordString = firstRecord.toString();

            // Output the first record
            System.out.println("First record: " + recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}