import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Define a CSV format with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Create a CSV string with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Initialize a map to store headers and values
            Map<String, String> dataMap = new HashMap<>();

            // Iterate over the records
            for (CSVRecord record : parser) {
                // Store header-value pairs in the map
                for (String header : parser.getHeaderNames()) {
                    dataMap.put(header, record.get(header));
                }
            }

            // Perform some operations on the map
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                System.out.println("Header: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Close the parser
            parser.close();

            // Re-parse the CSV data to demonstrate reading the comment
            parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}