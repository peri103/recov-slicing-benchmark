import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Prepare a CSV input for reading
            String csvData = "column1,column2\nvalue1,value2";
            Reader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            CSVRecord record = parser.getRecords().get(0);

            // Read using the read method
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}