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
            // Create a CSV format instance with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a CSV string to parse
            String csvData = "id,name\n1,John Doe\n2,Jane Smith";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get all records
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store id-name pairs
            HashMap<Integer, String> idNameMap = new HashMap<>();

            // Process each record and add to map
            for (CSVRecord record : records) {
                int id = Integer.parseInt(record.get("id"));
                String name = record.get("name");
                idNameMap.put(id, name);
            }

            // Print the map
            System.out.println("ID-Name Map: " + idNameMap);

            // Additional logic to manipulate data
            ArrayList<String> namesList = new ArrayList<>(idNameMap.values());
            namesList.add("Alice Johnson");
            namesList.remove("John Doe");

            // Print the updated list of names
            System.out.println("Updated Names List: " + namesList);

            // Get the first record
            CSVRecord firstRecord = records.get(0);

            // Read the comment from the first record
            /* read */ String comment = firstRecord.getComment();

            // Print the comment
            System.out.println("Comment from first record: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}