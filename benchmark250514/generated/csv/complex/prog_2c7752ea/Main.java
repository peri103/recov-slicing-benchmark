import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with auto flush
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withAutoFlush(true);

        // Sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nDoe,25,Los Angeles\nAlice,28,Chicago";

        // Parse the CSV data using the format
        CSVParser parser = csvFormat.parse(new StringReader(csvData));
        List<CSVRecord> records = parser.getRecords();

        // Additional processing: collect all names into a list
        List<String> names = new ArrayList<>();
        for (CSVRecord record : records) {
            names.add(record.get("name"));
        }

        // Print all names
        System.out.println("Names from CSV:");
        for (String name : names) {
            System.out.println(name);
        }

        // Additional unrelated computation
        int sumOfAges = 0;
        for (CSVRecord record : records) {
            sumOfAges += Integer.parseInt(record.get("age"));
        }
        System.out.println("Sum of ages: " + sumOfAges);

        // Read the first record and check if it's mapped
        /* read */ boolean isMapped = records.get(0).isMapped("name");
        
        System.out.println("Is 'name' mapped in the first record? " + isMapped);

        // Additional unrelated logic to find the average age
        double averageAge = (double) sumOfAges / records.size();
        System.out.println("Average age: " + averageAge);

        // Process and print city names
        List<String> cities = new ArrayList<>();
        for (CSVRecord record : records) {
            cities.add(record.get("city"));
        }
        
        System.out.println("Cities from CSV:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}