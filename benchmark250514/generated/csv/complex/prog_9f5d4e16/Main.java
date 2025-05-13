import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Prepare a CSV string with comments
            String csvData = "# This is a comment\nname,age\nJohn,30\n";
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Prepare a list and a map for additional operations
            List<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();
            
            // Add some names to the list
            names.add("Alice");
            names.add("Bob");
            
            // Add some ages to the map
            ageMap.put("Alice", 25);
            ageMap.put("Bob", 28);
            
            // Iterate over the records and populate the map
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                ageMap.put(name, age);
            }
            
            // Perform some operations on the list
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }
            
            // Read the first record to obtain the comment
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println(comment);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}