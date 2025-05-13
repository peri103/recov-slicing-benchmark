import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a custom delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');

        // Sample CSV data to parse
        String csvData = "name;age;city\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";

        // Parse the CSV data using the format with the custom delimiter
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional unrelated operations
            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("John Doe", 30);
            ageMap.put("Jane Smith", 25);

            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                totalAge += entry.getValue();
            }
            System.out.println("Total age: " + totalAge);

            for (CSVRecord record : parser) {
                // Perform some unrelated operations
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                String city = record.get(2);

                System.out.println("Processing record: " + name + ", " + age + ", " + city);

                // Read the first record and convert it to a string
                if (name.equals("John Doe")) {
                    /* read */ String recordString = record.toString();
                    System.out.println(recordString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}