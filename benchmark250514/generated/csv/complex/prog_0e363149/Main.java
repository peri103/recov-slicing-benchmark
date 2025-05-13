import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a writer and a CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write multiple records to the CSVPrinter
            List<String> record1 = Arrays.asList("value1", "value2");
            List<String> record2 = Arrays.asList("value3", "value4");
            printer.printRecord(record1);
            printer.printRecord(record2);
            printer.flush();

            // Perform some unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            // Process the list of numbers
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Simulate complex logic by reversing the list
            ArrayList<Integer> reversedNumbers = new ArrayList<>();
            for (int i = numbers.size() - 1; i >= 0; i--) {
                reversedNumbers.add(numbers.get(i));
            }
            System.out.println("Reversed numbers: " + reversedNumbers);

            // Read the comment from the CSVRecord
            String csvContent = writer.toString();
            CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            /* read */ String comment = csvRecord.getComment();

            // Print the comment
            System.out.println("CSV Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}