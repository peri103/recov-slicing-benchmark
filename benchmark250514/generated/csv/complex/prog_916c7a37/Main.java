import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize necessary components
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a comment using CSVPrinter
            /* write */ printer.printComment("This is a comment");

            // Additional complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 2);
            }

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < numbers.size(); i++) {
                map.put("key" + i, numbers.get(i));
            }

            // Complex operation using map
            int sum = 0;
            for (String key : map.keySet()) {
                sum += map.get(key);
            }

            // Flush the printer to ensure data is written to the writer
            printer.flush();

            // Read the comment using CSVRecord
            String csvString = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(new java.io.StringReader(csvString)).getRecords();
            String comment = null;
            for (CSVRecord record : records) {
                /* read */ comment = record.getComment();
                if (comment != null) break;
            }

            // Output the comment
            System.out.println(comment);

            // Output the sum of numbers
            System.out.println("Sum of numbers: " + sum);

            // Close the printer
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}