import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            ArrayList<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Create a HashMap to store age information
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                ageMap.put(name, age);
            }

            // Perform some operations on the records
            int sumAges = 0;
            for (Integer age : ageMap.values()) {
                sumAges += age;
            }
            System.out.println("Sum of ages: " + sumAges);

            // Convert the first record to a string and print it
            CSVRecord firstRecord = records.get(0);
            /* read */ String recordString = firstRecord.toString();
            System.out.println(recordString);

            // Further operations on records
            for (CSVRecord record : records) {
                String city = record.get(2);
                System.out.println("City: " + city);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}