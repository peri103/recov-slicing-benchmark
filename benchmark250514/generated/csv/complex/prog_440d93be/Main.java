import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try (CSVPrinter printer = new CSVPrinter(writer, format)) {
            /* write */ printer.printComment("This is a comment");
            printer.printRecord("ID", "Name", "Age");
            printer.printRecord(1, "Alice", 30);
            printer.printRecord(2, "Bob", 25);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String csvData = writer.toString();
        System.out.println("CSV Data:");
        System.out.println(csvData);

        // Additional complex logic: parsing the CSV data into a map
        Map<Integer, String> idToNameMap = new HashMap<>();
        try (CSVParser parser = CSVParser.parse(new StringReader(csvData), format)) {
            for (CSVRecord record : parser) {
                if (record.getRecordNumber() > 1) { // Skip the header
                    int id = Integer.parseInt(record.get(0));
                    String name = record.get(1);
                    idToNameMap.put(id, name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the map
        System.out.println("ID to Name Map:");
        for (Map.Entry<Integer, String> entry : idToNameMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // More complex logic: working with a list of ages
        List<Integer> ages = new ArrayList<>();
        ages.add(30);
        ages.add(25);
        ages.add(40);
        ages.add(35);

        // Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = sum / (double) ages.size();
        System.out.println("Average Age: " + averageAge);

        // Original read operation
        try (CSVParser parser = CSVParser.parse(new StringReader(csvData), format)) {
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Read Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}