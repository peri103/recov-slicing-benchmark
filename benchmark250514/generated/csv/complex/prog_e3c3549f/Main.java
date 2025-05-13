import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Prepare a CSV data string with a comment and records
            String csvData = "#This is a comment\nname,age\nJohn,30\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Process the records
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                if (!record.get(0).startsWith("#")) { // Skip comment lines
                    String name = record.get("name");
                    int age = Integer.parseInt(record.get("age"));
                    ageMap.put(name, age);
                }
            }

            // Perform some operations on the data
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Comment: " + comment);

            // Close the parser
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}