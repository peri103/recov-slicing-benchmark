import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with trimming
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

        // Sample CSV data
        String csvData = "name, age, location\nJohn Doe, 30, New York";

        // Parse the CSV data using the format
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Iterate over records to populate names
        for (CSVRecord record : records) {
            if (record.isMapped("name")) {
                names.add(record.get("name"));
            }
        }

        // Perform operations on names
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Read the first record and check if a field is mapped
        CSVRecord firstRecord = records.get(0);
        /* read */ boolean isMapped = firstRecord.isMapped("name");

        // Output the result
        System.out.println("Is 'name' mapped: " + isMapped);

        // More complex operations
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(30);
        ages.add(25);
        ages.add(40);

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        System.out.println("Total age: " + sum);

        // Additional CSV parsing operation
        String csvData2 = "product, price\nLaptop, 1000\nPhone, 500";
        CSVParser parser2 = CSVParser.parse(new StringReader(csvData2), format);
        List<CSVRecord> productRecords = parser2.getRecords();

        for (CSVRecord productRecord : productRecords) {
            if (productRecord.isMapped("product")) {
                System.out.println("Product: " + productRecord.get("product"));
            }
        }
    }
}