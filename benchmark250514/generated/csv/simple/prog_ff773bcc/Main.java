import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat with a specific null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Prepare a CSV input string
        String csvData = "Name,Age\nJohn,30\nJane,NULL\n";

        // Parse the CSV data
        try (Reader in = new StringReader(csvData);
             CSVParser parser = new CSVParser(in, format)) {

            // Get the first record
            CSVRecord record = parser.getRecords().get(1);

            // Check if the "Age" column is mapped
            /* read */ boolean isMapped = record.isMapped("Age");

            // Print the result
            System.out.println(isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}