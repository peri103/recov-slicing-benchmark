import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV content
            String csvContent = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";

            // Parse the CSV content with the header
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();
            
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);
            CSVRecord record = parser.getRecords().get(0); // Get the first record

            // Add complexity: Map to store CSV data
            Map<String, String> dataMap = new HashMap<>();
            for (String header : parser.getHeaderMap().keySet()) {
                dataMap.put(header, record.get(header));
            }

            // Perform some operations on the map
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // More complex operations: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord rec : parser) {
                totalAge += Integer.parseInt(rec.get("Age"));
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);

            // Check if a specific header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' column mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}