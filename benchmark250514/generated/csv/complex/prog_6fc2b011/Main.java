import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSV format with ignoring empty lines
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Additional unrelated code for complexity
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            
            for (CSVRecord record : records) {
                if (record.isConsistent()) {
                    names.add(record.get(0));
                    ages.add(Integer.parseInt(record.get(1)));
                }
            }
            
            // Processing names and ages
            for (String name : names) {
                System.out.println("Name: " + name);
            }
            
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            System.out.println("Average Age: " + (totalAge / ages.size()));

            // Read the first record to check consistency
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            
            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}