import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with the specified setting
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "id,name\n1,John Doe\n2,Jane Smith\n\n3,Bob Johnson";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional operations on the parsed records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get("name");
                names.add(name);
            }

            // Perform some calculations or manipulations
            int totalLength = 0;
            for (String name : names) {
                totalLength += name.length();
            }
            System.out.println("Total length of all names: " + totalLength);

            // Read the first record to check if it's consistent
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // More complex operations
            int nameCount = names.size();
            System.out.println("Number of names: " + nameCount);

            for (int i = 0; i < nameCount; i++) {
                System.out.println("Name " + (i + 1) + ": " + names.get(i));
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}