import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data as a string
        String csvData = "Name, Age, City\nJohn, 30, New York\nJane, 25, Los Angeles";

        // Initialize CSVFormat with trimming enabled
        CSVFormat format = CSVFormat.DEFAULT.withTrim(); // /* write */

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional operations to increase complexity
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> cities = new ArrayList<>();

            for (CSVRecord record : records) {
                names.add(record.get("Name"));
                ages.add(Integer.parseInt(record.get("Age")));
                cities.add(record.get("City"));
            }

            // Perform some calculations
            int totalAge = 0;
            for (Integer age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record and check if a column is mapped
            CSVRecord firstRecord = records.get(0);
            boolean isMapped = firstRecord.isMapped("Name"); // /* read */
            System.out.println(isMapped);

            // Additional output to demonstrate complexity
            System.out.println("Names: " + names);
            System.out.println("Cities: " + cities);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}