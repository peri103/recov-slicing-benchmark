import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name, age\nAlice, 30\nBob, 25";
            
            // Create a CSVFormat instance with ignore surrounding spaces
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
            
            // Additional logic to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Perform some operations on the records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
                if (record.isSet("age")) {
                    System.out.println("Age is set for: " + record.get("name"));
                }
            }
            
            // More complex logic
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                sumOfAges += Integer.parseInt(record.get("age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);
            
            // Read the first record and check if a specific column is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("name");
            
            System.out.println("Is 'name' set in the first record? " + isNameSet);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}