import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        // Use CSVFormat to parse the CSV data
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeader("Name", "Age", "Location");

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("Age");
                System.out.println("Is 'Age' column set in record: " + isSet);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}