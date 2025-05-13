import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVPrinter
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

        // Initialize a separate list for unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Print the numbers
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        // Write a comment using CSVPrinter
        /* write */ printer.printComment("This is a comment");

        printer.flush();
        printer.close();

        // Perform operations on the list
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read the comment using CSVRecord
        Reader reader = new StringReader(writer.toString());
        List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();

        // Assuming the comment is associated with the first record
        CSVRecord record = records.get(0);
        /* read */ String comment = record.getComment();

        System.out.println("Comment: " + comment);

        // Additional complex operations with the list
        int product = 1;
        for (Integer number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }
}