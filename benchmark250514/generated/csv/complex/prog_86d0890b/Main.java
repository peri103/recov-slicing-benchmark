import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');

        // Sample CSV data as a string
        String csvData = "\"name\",\"age\"\n\"John Doe\",\"30\"";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Create an ArrayList to store string representations of records
            ArrayList<String> recordStrings = new ArrayList<>();

            // Process each record and add its string representation to the list
            for (CSVRecord record : records) {
                recordStrings.add(record.toString());
            }

            // Perform some complex operations on the record strings
            for (String recordString : recordStrings) {
                System.out.println("Processing record: " + recordString);
                // Simulate some complex logic here
                for (char c : recordString.toCharArray()) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Output the string representation of the CSVRecord
            System.out.println(recordString);

            // Further complex operations
            int sum = 0;
            for (int i = 0; i < recordString.length(); i++) {
                sum += recordString.charAt(i);
            }
            System.out.println("Sum of ASCII values: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}