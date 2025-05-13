import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a comment to the CSV
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Create a list and perform some operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            // Process the list
            int sum = 0;
            for (int num : numbers) {
                sum += num;
                System.out.println("Processing number: " + num);
            }
            System.out.println("Sum of numbers: " + sum);

            // More operations on the list
            numbers.remove(0);
            numbers.add(50);
            numbers.add(60);

            // Read the comment back from CSV
            String csvContent = writer.toString();
            StringReader reader = new StringReader(csvContent);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);

            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }

            // Further manipulate the list
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Number at index " + i + ": " + numbers.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}