import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');
            /* write */ format = format.withDelimiter(';'); // Ensuring write method is executed once

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York\nAlice;25;Los Angeles";

            // Parsing the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional complex operations
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> cities = new ArrayList<>();

            for (CSVRecord record : records) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
                cities.add(record.get(2));
            }

            // Perform some complex calculations
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();

            // Print out additional information
            System.out.println("Names: " + names);
            System.out.println("Average Age: " + averageAge);
            System.out.println("Cities: " + cities);

            // Reading the first record
            /* read */ String recordString = records.get(0).toString(); // Ensuring read method is executed once

            // Output the result
            System.out.println("First Record: " + recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}