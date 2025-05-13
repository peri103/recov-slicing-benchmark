import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment to the CSV
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();

            // Additional complexity: Create a map to store some data
            Map<String, Integer> dataMap = new HashMap<>();
            dataMap.put("Alice", 30);
            dataMap.put("Bob", 25);
            dataMap.put("Charlie", 35);

            // Iterate over the map and print the data
            for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Prepare a StringReader to read the CSV output
            StringReader reader = new StringReader(writer.toString());

            // Parse the CSV output
            CSVParser parser = CSVFormat.DEFAULT.parse(reader);

            // Additional complexity: Calculate the average age from the map
            int totalAge = 0;
            for (int age : dataMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) dataMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the CSV
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            // Close resources
            csvPrinter.close();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}