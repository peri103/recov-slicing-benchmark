import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "# This is a comment\nName,Age\nAlice,30\nBob,25";
            
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();
            
            // Initialize a list to store names
            ArrayList<String> names = new ArrayList<>();
            
            // Process each record except the first (header)
            for (int i = 1; i < records.size(); i++) {
                CSVRecord record = records.get(i);
                String name = record.get("Name");
                names.add(name);
            }
            
            // Print all names
            System.out.println("Names in CSV:");
            for (String name : names) {
                System.out.println(name);
            }
            
            // Retrieve the first record (header)
            CSVRecord headerRecord = records.get(0);
            
            // Read the comment from the header record
            /* read */ String comment = headerRecord.getComment();
            
            // Print the comment
            System.out.println("Header Comment: " + comment);
            
            // Additional processing: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (int i = 1; i < records.size(); i++) {
                CSVRecord record = records.get(i);
                int age = Integer.parseInt(record.get("Age"));
                totalAge += age;
                count++;
            }
            
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}