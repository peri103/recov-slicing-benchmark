import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the specified configuration
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

        // Sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\n\nAlice,25,Los Angeles";

        // Additional data processing
        ArrayList<String> processedData = new ArrayList<>();
        processedData.add("Processed Data Start");

        try {
            // Parse the CSV data using the configured CSVFormat
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Process each record and extract information
            for (CSVRecord record : records) {
                if (record.isSet("name")) {
                    processedData.add("Name: " + record.get("name"));
                }
                if (record.isSet("age")) {
                    processedData.add("Age: " + record.get("age"));
                }
                if (record.isSet("city")) {
                    processedData.add("City: " + record.get("city"));
                }
            }

            // Access a specific record and column
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record? " + isSet);

            // More complex operations on processed data
            for (String data : processedData) {
                System.out.println(data);
            }

            // Final processing step
            processedData.add("Processed Data End");
            for (String data : processedData) {
                if (data.contains("Processed")) {
                    System.out.println("Log: " + data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}