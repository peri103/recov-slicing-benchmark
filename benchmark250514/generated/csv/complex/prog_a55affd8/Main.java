import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

        // Sample CSV data
        String csvData = "name,age,city\nJohn,NULL,New York\nAlice,30,NULL";

        try {
            // Parse the CSV data into records
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
            Iterator<CSVRecord> iterator = records.iterator();

            // Additional unrelated data processing
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            while (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                String name = record.get("name");
                String ageStr = record.get("age");
                Integer age = ageStr.equals("NULL") ? null : Integer.parseInt(ageStr);
                nameToAgeMap.put(name, age);

                // Perform some operations with the map
                if (age != null) {
                    System.out.println(name + " is " + age + " years old.");
                } else {
                    System.out.println(name + " has no age specified.");
                }
            }

            // Reset the iterator for further processing
            iterator = records.iterator();

            // Access the first record again
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();

                // Check if a specific column is set (not null)
                /* read */ boolean isAgeSet = record.isSet("age");
                System.out.println("Is 'age' set in the first record? " + isAgeSet);

                // Further processing with the CSV data
                if (isAgeSet) {
                    String ageStr = record.get("age");
                    System.out.println("Age in first record: " + ageStr);
                }
            }

            // Additional complex logic
            for (String name : nameToAgeMap.keySet()) {
                Integer age = nameToAgeMap.get(name);
                if (age != null && age > 25) {
                    System.out.println(name + " is older than 25.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}