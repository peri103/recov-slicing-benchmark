import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, Location\nJohn Doe, 30, New York";

        try {
            // Initialize CSVFormat with the write method
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Parse CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional data processing using ArrayList
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();
            List<String> locations = new ArrayList<>();

            for (CSVRecord record : parser) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1).trim()));
                locations.add(record.get(2));
            }

            // Process the data further
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i) + ", Location: " + locations.get(i));
            }

            // Use the read method far apart from the write
            for (CSVRecord record : parser) {
                /* read */
                boolean isConsistent = record.isConsistent();
                System.out.println("Is record consistent? " + isConsistent);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}