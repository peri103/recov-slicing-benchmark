import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with header comments
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

        // Create a CSVRecord using the format
        String csvData = "header1,header2\nvalue1,value2";
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

        // Initialize a HashMap to simulate a database
        HashMap<String, String> database = new HashMap<>();
        database.put("header1", "value1");
        database.put("header2", "value2");

        // Process the records and populate the database
        for (CSVRecord rec : records) {
            for (String header : format.getHeader()) {
                database.put(header, rec.get(header));
            }
        }

        // Perform some operations on the database
        String fetchedValue = database.get("header1");
        System.out.println("Fetched from database: " + fetchedValue);

        // Assuming we want to read the comment from the first record
        CSVRecord record = records.get(0);

        // Read the comment from the CSVRecord
        /* read */ String comment = record.getComment();

        // Output the comment
        System.out.println("Comment from CSVRecord: " + comment);

        // Additional complex operations
        int sum = 0;
        for (String value : database.values()) {
            sum += value.length();
        }
        System.out.println("Sum of lengths of values: " + sum);

        // Create a new CSVFormat with different settings
        CSVFormat newFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines(true).withDelimiter(';');
        String newCsvData = "name;age;city\nAlice;30;New York\nBob;25;Los Angeles";
        List<CSVRecord> newRecords = newFormat.parse(new StringReader(newCsvData)).getRecords();

        // Process new records
        for (CSVRecord newRecord : newRecords) {
            System.out.println("Name: " + newRecord.get("name") + ", Age: " + newRecord.get("age") + ", City: " + newRecord.get("city"));
        }
    }
}