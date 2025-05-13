import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles";
        CSVFormat format = CSVFormat.DEFAULT;

        // Write operation
        /* write */ format = format.withIgnoreEmptyLines();

        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            Map<String, Integer> nameFrequency = new HashMap<>();

            for (CSVRecord record : parser) {
                // Process each record and count name occurrences
                if (record.isSet("name")) {
                    String name = record.get("name");
                    nameFrequency.put(name, nameFrequency.getOrDefault(name, 0) + 1);
                }

                // Some unrelated complex logic
                int age = record.isSet("age") ? Integer.parseInt(record.get("age")) : -1;
                if (age > 0) {
                    System.out.println("Age is valid: " + age);
                } else {
                    System.out.println("Age data is missing or invalid");
                }
            }

            // Read operation
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set: " + isSet);
            }

            // Display name frequency
            for (Map.Entry<String, Integer> entry : nameFrequency.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}