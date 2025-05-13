import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with escape character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withEscape('\\');

        // Prepare to write data into a CSV string
        StringWriter out = new StringWriter();
        try (CSVPrinter printer = new CSVPrinter(out, format)) {
            printer.printRecord("Hello", "World");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional complex logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);

        // Read the CSV record from the generated string
        String csvData = out.toString();
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).iterator().next();
        /* read */ String recordString = record.toString();

        // Output the read value
        System.out.println(recordString);

        // More complex logic
        List<String> words = new ArrayList<>();
        words.add("Foo");
        words.add("Bar");
        words.add("Baz");

        for (String word : words) {
            System.out.println("Word: " + word);
        }

        // Additional operations on numbers list
        List<Integer> doubledNumbers = new ArrayList<>();
        for (int number : numbers) {
            doubledNumbers.add(number * 2);
        }

        System.out.println("Doubled numbers: " + doubledNumbers);
    }
}