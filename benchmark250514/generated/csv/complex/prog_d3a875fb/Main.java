import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and set the quote character
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withQuote('"');

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, \"New York, USA\"";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Additional data structure to store parsed data
            Map<String, String> dataMap = new HashMap<>();

            for (CSVRecord record : parser) {
                // Store data in the map
                dataMap.put(record.get(0), record.get(2));

                // Perform some unrelated complex operations
                int age = Integer.parseInt(record.get(1));
                if (age > 25) {
                    System.out.println("Age is greater than 25");
                }

                // Complex arithmetic operation
                int complexCalculation = (age * 2) + 5 - 3 / 2;
                System.out.println("Complex Calculation Result: " + complexCalculation);

                // Read the first record to a string
                /* read */ String recordString = record.toString();
                System.out.println(recordString);
                break; // Ensure the read method is executed only once
            }

            // Print out the data stored in the map
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Location: " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}