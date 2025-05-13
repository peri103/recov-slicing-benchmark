import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it to ignore empty lines
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines();
            
            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles\n";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            
            // Additional complex logic: List operations
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();
            List<String> cities = new ArrayList<>();
            
            // Populate the lists with data from CSV records
            for (CSVRecord record : parser) {
                if (record.size() == 3) {
                    names.add(record.get(0));
                    ages.add(Integer.parseInt(record.get(1)));
                    cities.add(record.get(2));
                }
            }
            
            // Perform some operations on the lists
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / ages.size();
            System.out.println("Average age: " + averageAge);
            
            // Re-parse the CSV data to demonstrate separation of read/write
            parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            
            // Iterate over the records and check if they are consistent
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
            
            // Additional complex logic: More list operations
            for (String name : names) {
                System.out.println("Name: " + name);
            }
            for (String city : cities) {
                System.out.println("City: " + city);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}