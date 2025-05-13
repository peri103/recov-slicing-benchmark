import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV configuration
            CSVConfiguration config = new CSVConfiguration();

            // Sample CSV data
            String csvData = "Name, Age\n John Doe , 29\n Jane Doe , 31";

            // Parse the CSV data
            CSVDataParser parser = new CSVDataParser(config.getCsvFormat(), csvData);

            // Access the records and age map
            HashMap<String, Integer> ageMap = parser.getAgeMap();
            for (String name : ageMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Use the read method
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ boolean isConsistent = firstRecord.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}