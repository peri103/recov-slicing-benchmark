import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            // Additional unrelated operations
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            int sum = 0;
            for (String name : names) {
                sum += name.length();
            }
            System.out.println("Sum of name lengths: " + sum);

            // Parse the written CSV content
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Process each record in the parser
            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord rec : records) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < rec.size(); i++) {
                    sb.append(rec.get(i)).append(" ");
                }
                System.out.println("Record: " + sb.toString().trim());
            }

            // Read the record
            CSVRecord record = records.get(0);
            /* read */ String firstName = record.get(0);

            // Print the read value
            System.out.println("First name from CSV: " + firstName);

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }

            int product = 1;
            for (int number : numbers) {
                product *= number;
            }
            System.out.println("Product of numbers: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}