import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Prepare CSV data
            String csvData = "name,age\nJohn Doe,30";

            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();

            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                names.add(name);
                ageMap.put(name, age);
            }

            // Perform some operations on names and ageMap
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Read and print the first record
            if (!records.isEmpty()) {
                /* read */ String recordString = records.get(0).toString();
                System.out.println("CSV Record: " + recordString);
            }

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }

            for (int number : numbers) {
                System.out.println("Number: " + number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}