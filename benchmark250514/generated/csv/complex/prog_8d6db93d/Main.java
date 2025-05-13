import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

        // Create a CSVFormat object with the header
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

        // Parse the CSV data using the format
        CSVParser parser = new CSVParser(new StringReader(csvData), format);

        // Get the records from the parser
        List<CSVRecord> records = parser.getRecords();

        // Create a map to store names and their corresponding ages
        Map<String, Integer> nameAgeMap = new HashMap<>();

        // Iterate over the records and populate the map
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            nameAgeMap.put(name, age);
        }

        // Output the map
        System.out.println("Name-Age map: " + nameAgeMap);

        // Read the first record
        CSVRecord firstRecord = records.get(0);

        // Perform some unrelated operations
        int sumOfAges = 0;
        for (Integer age : nameAgeMap.values()) {
            sumOfAges += age;
        }
        System.out.println("Sum of ages: " + sumOfAges);

        // Check if the 'Name' field is mapped
        /* read */ boolean isNameMapped = firstRecord.isMapped("Name");

        // Output the result
        System.out.println("Is 'Name' mapped: " + isNameMapped);

        // Create another CSVFormat and parse different data
        String newCsvData = "Product,Price\nApple,1.00\nBanana,0.50";
        CSVFormat newFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        CSVParser newParser = new CSVParser(new StringReader(newCsvData), newFormat);
        List<CSVRecord> newRecords = newParser.getRecords();

        // Process the new records
        for (CSVRecord newRecord : newRecords) {
            String product = newRecord.get("Product");
            String price = newRecord.get("Price");
            System.out.println("Product: " + product + ", Price: " + price);
        }
    }
}