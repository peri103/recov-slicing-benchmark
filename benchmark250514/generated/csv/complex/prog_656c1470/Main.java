import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "name,age\nJohn,30\nJane,25";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();

            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0); // Get the first record

            // Unrelated code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : parser.getRecords()) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                names.add(name);
                ageMap.put(name, age);
            }

            // Additional logic using the names and ageMap
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // More unrelated code
            int sumOfAges = 0;
            for (int age : ageMap.values()) {
                sumOfAges += age;
            }
            System.out.println("Total sum of ages: " + sumOfAges);

            // Read operation
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}