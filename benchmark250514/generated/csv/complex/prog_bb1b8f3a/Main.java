import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoring empty lines
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

        // Sample data to test reading
        List<String> data = Arrays.asList("Name, Age", "Alice, 30", "", "Bob, 25");

        // Parse the sample data using CSVFormat
        List<CSVRecord> records = null;
        try {
            records = format.parse(new java.io.StringReader(String.join("\n", data))).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Additional code for complexity
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> ageMap = new HashMap<>();

        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            namesList.add(name);
            ageMap.put(name, age);
        }

        // Processing names and ages
        for (String name : namesList) {
            int age = ageMap.get(name);
            System.out.println(name + " is " + age + " years old.");
        }

        // Ensure that we have records to read
        if (records != null && !records.isEmpty()) {
            // Read the first record and check if a field is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' field set in the first record? " + isSet);
        }

        // More complex operations with the data
        namesList.removeIf(name -> ageMap.get(name) < 30);

        System.out.println("Names of people older than 30:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}