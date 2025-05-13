import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withQuote('"');

        // Create a CSVRecord to read
        String csvData = "\"value1\",\"value2\"";
        CSVRecord record = null;
        try {
            record = csvFormat.parse(new StringReader(csvData)).getRecords().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional code to make the program more complex
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String item : list) {
            System.out.println(item);
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Read the CSVRecord
        /* read */ String recordString = record.toString();
        System.out.println(recordString);

        // Further complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * i);
        }

        for (int number : numbers) {
            System.out.println("Square: " + number);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append("Iteration ").append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}