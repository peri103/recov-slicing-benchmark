import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create CSVFormat with ignore surrounding spaces
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a list to store the ages
            List<Integer> ages = new ArrayList<>();

            // Read records
            for (CSVRecord record : parser) {
                // Extract age and add to list
                int age = Integer.parseInt(record.get(1).trim());
                ages.add(age);

                // Check if record is consistent
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }

            // Calculate the average age
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / ages.size();
            System.out.println("Average Age: " + averageAge);

            // Find the maximum age
            int maxAge = ages.stream().max(Integer::compareTo).orElse(0);
            System.out.println("Maximum Age: " + maxAge);

            // Find the minimum age
            int minAge = ages.stream().min(Integer::compareTo).orElse(0);
            System.out.println("Minimum Age: " + minAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}