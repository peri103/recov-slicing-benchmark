import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter out = new StringWriter();
            // Create a CSVPrinter using CSVFormat.DEFAULT
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);

            // Write a comment using printComment
            /* write */ printer.printComment("This is a comment");

            // Add some additional data to CSV
            printer.printRecord("Name", "Age", "Country");
            printer.printRecord("Alice", 30, "USA");
            printer.printRecord("Bob", 25, "UK");

            // Close the printer to flush the content
            printer.close();

            // Parse the CSV output using CSVParser
            StringReader reader = new StringReader(out.toString());
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT.withCommentMarker('#'));

            // Create a map to store data
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Process each record
            for (CSVRecord csvRecord : parser) {
                if (!csvRecord.get(0).equals("Name")) { // Skip header
                    String name = csvRecord.get(0);
                    int age = Integer.parseInt(csvRecord.get(1));
                    ageMap.put(name, age);
                }
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Read the first record and get the comment
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            // Close the parser
            parser.close();

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * i);
            }
            System.out.println("Squared Numbers: " + numbers);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}