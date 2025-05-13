import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Adding numbers to the list
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 5);
            }
            
            // Perform some operations on the list
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            
            Reader reader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            List<CSVRecord> records = csvParser.getRecords();
            
            // Print the sum of the numbers
            System.out.println("Sum of numbers: " + sum);
            
            // Perform some string manipulations
            String message = "Complex Program";
            String reversedMessage = new StringBuilder(message).reverse().toString();
            System.out.println("Reversed Message: " + reversedMessage);
            
            /* read */ String value = records.get(0).get(0);
            System.out.println(value);

            csvPrinter.close();
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}