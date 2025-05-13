import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a writer and format
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT;
            
            // Initialize a list to hold CSV content
            List<String> csvContentList = new ArrayList<>();
            csvContentList.add("value1,value2,value3");
            csvContentList.add("value4,value5,value6");

            // Add escape character to the format
            /* write */ format = format.withEscape('\\');

            // Use the format to print records
            CSVPrinter printer = new CSVPrinter(writer, format);
            for (String record : csvContentList) {
                printer.printRecord(record.split(","));
            }
            printer.flush();

            // Parse the CSV content back into records
            String csvContent = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords();

            // Process the records
            List<String> processedRecords = new ArrayList<>();
            for (CSVRecord record : records) {
                processedRecords.add(record.toString());
            }

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read from the processed records
            /* read */ String recordString = processedRecords.get(0);
            System.out.println(recordString);

            // Further processing on records
            for (String processedRecord : processedRecords) {
                System.out.println("Processed Record: " + processedRecord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}