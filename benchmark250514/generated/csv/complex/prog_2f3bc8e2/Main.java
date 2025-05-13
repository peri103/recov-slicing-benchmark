import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Create a list of strings
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            // Perform some operations on the list
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Add more elements to the list
            names.add("David");
            names.add("Eve");

            // Sort the list
            names.sort(String::compareTo);

            // Print the sorted list
            System.out.println("Sorted Names:");
            for (String name : names) {
                System.out.println(name);
            }

            // CSV parsing
            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // More list operations
            if (!names.isEmpty()) {
                System.out.println("First name in the list: " + names.get(0));
            }

            // Further CSV operations
            for (CSVRecord rec : parser) {
                System.out.println("Record: " + rec);
            }

            /* read */ String comment = record.getComment();
            System.out.println("Comment from CSV: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}