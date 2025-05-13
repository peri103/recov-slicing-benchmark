import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\n\nJane,25";
        CSVFormat format = CSVFormat.DEFAULT;

        // Additional complex operations
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Jane", 25);

        // Some transformations
        for (String name : names) {
            if (ageMap.containsKey(name)) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }
        }

        /* write */ format = format.withIgnoreEmptyLines(true);

        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                if (record.isSet("name")) {
                    String name = record.get("name");
                    System.out.println("Name in record: " + name);
                }
                // More complex logic
                if (record.isSet("age")) {
                    int age = Integer.parseInt(record.get("age"));
                    System.out.println("Age in record: " + age);
                }
                // Further processing
                for (String field : record) {
                    System.out.println("Field: " + field);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // More complex logic after the read
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Record isSet for 'name': " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}