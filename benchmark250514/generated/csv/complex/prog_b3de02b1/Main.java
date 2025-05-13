import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter to write records
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Writing multiple records
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.printRecord("Jane", "Smith", "25");
            csvPrinter.printRecord("Emily", "Jones", "40");
            csvPrinter.flush();

            // Simulate complex data processing
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Parse the written CSV content
            String csvContent = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            List<CSVRecord> records = parser.getRecords();

            // More unrelated processing
            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                sumOfAges += Integer.parseInt(rec.get(2));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Access specific CSV record
            CSVRecord record = records.get(0);
            /* read */ String firstName = record.get(0);

            // Output the accessed value
            System.out.println("First name from CSV: " + firstName);

            // Additional complex processing
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            for (int number : numbers) {
                System.out.println("Number: " + number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}