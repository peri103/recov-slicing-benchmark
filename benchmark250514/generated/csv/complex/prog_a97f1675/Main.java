import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escaping character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Create a sample CSV input
            String csvData = "Name,Age,Occupation\nJohn Doe,30,Engineer\nJane Smith,25,Artist";

            // Parse the CSV data using the format with escape character
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Initialize a list to store CSVRecord objects
            List<CSVRecord> recordList = new ArrayList<>();

            // Iterate over records and add them to the list
            for (CSVRecord rec : records) {
                recordList.add(rec);
            }

            // Perform some operations on the list
            System.out.println("Record count: " + recordList.size());
            for (CSVRecord rec : recordList) {
                System.out.println("Name: " + rec.get(0) + ", Age: " + rec.get(1) + ", Occupation: " + rec.get(2));
            }

            // Further processing on records
            List<String> occupations = new ArrayList<>();
            for (CSVRecord rec : recordList) {
                occupations.add(rec.get(2));
            }
            System.out.println("Occupations: " + occupations);

            // Read the first record and convert it to a string
            CSVRecord firstRecord = recordList.get(0);
            /* read */ String recordString = firstRecord.toString();

            // Print the string representation of the first record
            System.out.println("First Record: " + recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}