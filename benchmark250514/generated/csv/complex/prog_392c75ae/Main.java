import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with ignoring surrounding spaces
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "id, name, age\n1, John Doe, 30\n2, Jane Smith, 25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Unrelated logic: Create a list of names from the records
            List<String> names = new ArrayList<>();
            for (CSVRecord record : parser) {
                names.add(record.get("name"));
            }
            
            // Print the names
            System.out.println("Names extracted from CSV:");
            for (String name : names) {
                System.out.println(name);
            }
            
            // More unrelated logic: Create a new CSV with modified data
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("id", "name", "age"));
            for (int i = 0; i < names.size(); i++) {
                printer.printRecord(i + 1, names.get(i), 20 + i * 5); // Modify ages
            }
            printer.flush();
            
            // Print the newly created CSV data
            System.out.println("Modified CSV data:");
            System.out.println(writer.toString());

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if a specific column is set in the record
            /* read */ boolean isNameSet = record.isSet("name");
            
            // Print the result
            System.out.println("Is 'name' column set in the first record? " + isNameSet);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}