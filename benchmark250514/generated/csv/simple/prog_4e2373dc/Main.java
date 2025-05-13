import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "name, age, city\nJohn, 30, New York";
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Is record consistent? " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}