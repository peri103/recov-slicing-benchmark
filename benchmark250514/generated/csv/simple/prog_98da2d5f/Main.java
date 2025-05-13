import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Initialize CSVFormat with first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record from the parser
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' header mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}