import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Create a CSVFormat instance and configure it
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create an ArrayList to store records
            ArrayList<CSVRecord> recordsList = new ArrayList<>();

            // Get an iterator for the parsed records
            Iterator<CSVRecord> iterator = parser.iterator();

            // Read the records and store them in the list
            while (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                recordsList.add(record);
            }

            // Process the records in the list
            for (CSVRecord record : recordsList) {
                // Print each record
                System.out.println("Record: " + record);
            }

            // Perform additional processing on the records
            for (int i = 0; i < recordsList.size(); i++) {
                CSVRecord record = recordsList.get(i);
                System.out.println("Processing record " + i + ": " + record.get(0) + ", " + record.get(1));
            }

            // Read the first record from the list
            if (!recordsList.isEmpty()) {
                CSVRecord firstRecord = recordsList.get(0);
                /* read */ boolean isConsistent = firstRecord.isConsistent();
                System.out.println("Is the first record consistent? " + isConsistent);
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}