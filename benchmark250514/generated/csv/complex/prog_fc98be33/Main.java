import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a header comment");

        // Prepare a CSV string to parse
        String csvData = "name,age\nJohn,30\nDoe,25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();

            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                names.add(name);
                ageMap.put(name, age);
            }

            // Perform some operations with the collected data
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Further processing
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Header Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}