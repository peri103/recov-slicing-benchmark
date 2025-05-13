import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Create CSVPrinter instance with custom format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL));
            
            // Write data using CSVPrinter
            /* write */ printer.print("Hello, World!");
            printer.flush();
            
            // Prepare a StringReader to read the CSV data
            StringReader reader = new StringReader(writer.toString());
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT);
            
            // Perform unrelated operations with an ArrayList
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 10);
            }
            
            // Print numbers from ArrayList
            for (int num : numberList) {
                System.out.println("Number: " + num);
            }
            
            // Perform operations with CSV data
            List<String> csvData = new ArrayList<>();
            for (CSVRecord rec : parser) {
                csvData.add(rec.get(0));
            }
            
            // Read the data using CSVRecord
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);
            
            // Output the value
            System.out.println("CSV Value: " + value);
            
            // Perform additional operations on CSV data
            for (String data : csvData) {
                System.out.println("CSV Data: " + data);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}