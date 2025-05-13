import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Unrelated code to make the program more complex
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();
            List<String> locations = new ArrayList<>();

            for (CSVRecord rec : parser) {
                names.add(rec.get("Name"));
                ages.add(Integer.parseInt(rec.get("Age")));
                locations.add(rec.get("Location"));
            }

            // Perform some operations on the lists
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            for (String location : locations) {
                System.out.println("Location: " + location);
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // More unrelated code
            int nameIndex = names.indexOf("John");
            if (nameIndex != -1) {
                System.out.println("Found John at index: " + nameIndex);
            }

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}