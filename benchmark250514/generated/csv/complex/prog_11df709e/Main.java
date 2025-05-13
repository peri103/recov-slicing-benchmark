import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter with comment marker
            StringWriter out = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(out, format);

            // Add some data to a list for demonstration purposes
            List<String> dataList = new ArrayList<>();
            dataList.add("Alice");
            dataList.add("Bob");
            dataList.add("Charlie");

            // Print data to CSV
            for (String data : dataList) {
                printer.printRecord(data);
            }

            // Write a comment to the CSV
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Further processing with CSV content
            String csvContent = out.toString();
            StringReader reader = new StringReader(csvContent);

            // Parse CSV records
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            for (CSVRecord record : records) {
                // Process each record, simulate some operations
                if (record.size() > 0) {
                    System.out.println("Processing record: " + record.get(0));
                }

                // Extract and print comment
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment found: " + comment);
                }
            }

            // Additional complex logic
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}