import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";
        
        try {
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
            
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */
                boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set: " + isSet);
                break; // Ensure read is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}