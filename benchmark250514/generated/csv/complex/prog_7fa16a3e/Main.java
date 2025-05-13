import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code to make the program more complex
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : records) {
                ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
            }

            // Process the map and print the ages
            for (String name : ageMap.keySet()) {
                System.out.println(name + "'s age is " + ageMap.get(name));
            }

            // Get the first record
            CSVRecord record = records.get(0);

            // More unrelated code
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);

            // Check if a header is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}