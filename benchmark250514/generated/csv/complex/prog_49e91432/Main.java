import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nAlice,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a list to store ages
            List<Integer> ages = new ArrayList<>();

            // Iterate over CSV records
            for (CSVRecord record : parser) {
                if (record.size() > 1) {
                    // Parse age and store it in the list
                    ages.add(Integer.parseInt(record.get(1)));
                }
            }

            // Process ages to calculate the average age
            double totalAge = 0;
            for (Integer age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / ages.size();
            System.out.println("Average age: " + averageAge);

            // Check consistency of records
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}