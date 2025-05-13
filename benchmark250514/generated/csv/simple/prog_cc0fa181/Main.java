import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name, age\nJohn Doe, 30";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(); // Set the format to ignore surrounding spaces

            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent(); // Check if the record is consistent
                System.out.println("Record is consistent: " + isConsistent);
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}