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
            // Initialize the writer for CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Use the write method to print a comment
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();

            // Additional complex operations
            ArrayList<String> list = new ArrayList<>();
            list.add("First");
            list.add("Second");
            list.add("Third");

            for (String item : list) {
                if (item.equals("Second")) {
                    System.out.println("Found: " + item);
                }
            }

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Parse the written CSV content
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT.withCommentMarker('#'));
            List<CSVRecord> records = parser.getRecords();

            // Additional logic before reading the comment
            int maxLength = 0;
            for (CSVRecord record : records) {
                maxLength = Math.max(maxLength, record.size());
            }
            System.out.println("Max record length: " + maxLength);

            // Use the read method to get the comment
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}