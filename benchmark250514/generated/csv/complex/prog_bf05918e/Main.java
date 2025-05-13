import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

        // Create a sample CSV string
        String csvData = "name, age\nJohn Doe, 30";

        // Parse the CSV string using the format
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

        // Additional code to increase complexity
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        // Populate names and ages lists from CSV records
        for (CSVRecord record : records) {
            if (record.isSet("name")) {
                names.add(record.get("name"));
            }
            if (record.isSet("age")) {
                ages.add(Integer.parseInt(record.get("age")));
            }
        }

        // Perform some operations on names and ages
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
        }

        // Use another CSVFormat operation for demonstration
        CSVFormat customFormat = CSVFormat.EXCEL.withDelimiter(';');
        String customCsvData = "product;price\nLaptop;999";
        List<CSVRecord> customRecords = customFormat.parse(new StringReader(customCsvData)).getRecords();

        for (CSVRecord customRecord : customRecords) {
            System.out.println("Product: " + customRecord.get("product") + ", Price: " + customRecord.get("price"));
        }

        // Read from the first record using the read method
        /* read */ boolean isSet = records.get(0).isSet("name");

        // Output the result
        System.out.println("Is 'name' set in the first record? " + isSet);
    }
}