import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize StringWriter for CSV data
        StringWriter writer = new StringWriter();
        // Initialize CSVFormat with default settings
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Additional complex operations
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<Integer> ages = Arrays.asList(25, 30, 35, 40);

        // Write operation: Set custom delimiter
        /* write */ csvFormat = csvFormat.withDelimiter(';');

        // Print names to CSV
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            csvPrinter.printRecord(names);
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println("Total age sum: " + sum);

        // More complex operations
        String csvData = writer.toString();
        String[] csvLines = csvData.split("\n");
        CSVRecord record = new CSVRecord(null, csvLines[0], null, csvFormat, 0, 0);

        // Perform operations on the CSV data
        String firstRecord = csvLines[0];
        String[] firstRecordValues = firstRecord.split(";");
        System.out.println("First name in CSV: " + firstRecordValues[0]);

        // Read operation: Convert CSVRecord to string
        /* read */ String value = record.toString();
        System.out.println("CSV Record: " + value);

        // Additional unrelated operations
        List<String> hobbies = Arrays.asList("Reading", "Traveling", "Cooking");
        for (String hobby : hobbies) {
            System.out.println("Hobby: " + hobby);
        }
    }
}