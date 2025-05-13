import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Prepare a CSV string for demonstration
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        // Create a CSVFormat instance with the first record as header
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withFirstRecordAsHeader();

        try (Reader reader = new StringReader(csvData); CSVParser parser = new CSVParser(reader, format)) {
            for (CSVRecord record : parser) {
                // Accessing the header mappings
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}