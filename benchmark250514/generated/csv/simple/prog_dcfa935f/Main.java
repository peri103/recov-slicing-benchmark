import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nAlice,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Iterate over CSV records
            for (CSVRecord record : parser) {
                // Use the read method
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}