import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Prepare CSV data
        String csvData = " Name , Age , Location \n John Doe , 29 , USA ";
        
        // Create CSVFormat instance and configure it to ignore surrounding spaces
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Parse the CSV data using the configured format
        List<CSVRecord> records = null;
        try {
            records = format.parse(new java.io.StringReader(csvData)).getRecords();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Read the first record and check consistency
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);
        }
    }
}