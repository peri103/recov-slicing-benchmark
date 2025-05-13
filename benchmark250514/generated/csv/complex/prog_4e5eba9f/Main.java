import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\nJane,25";
        
        // Initialize CSVFormat with an escape character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withEscape('\\');
        
        // Add more configurations to CSVFormat
        format = format.withQuoteMode(QuoteMode.MINIMAL);

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Process each record and store in a list
            List<String> recordsList = new ArrayList<>();
            for (CSVRecord record : parser) {
                recordsList.add(record.toString());
            }
            
            // Perform some unrelated operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Read the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ String recordString = firstRecord.toString();
            
            // Output the record string
            System.out.println(recordString);
            
            // Output all records stored in list
            System.out.println("All records:");
            for (String rec : recordsList) {
                System.out.println(rec);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}