import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data using CSVPrinter
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            // Additional complex operations
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            
            // Manipulating the list
            for (String name : names) {
                System.out.println("Processing: " + name);
            }

            // Prepare another CSV record
            StringWriter writer2 = new StringWriter();
            CSVPrinter csvPrinter2 = new CSVPrinter(writer2, CSVFormat.DEFAULT);
            csvPrinter2.printRecord("Alice", "Smith", "25");
            csvPrinter2.flush();

            // Parsing the CSV data
            StringReader reader2 = new StringReader(writer2.toString());
            CSVParser parser2 = CSVParser.parse(reader2, CSVFormat.DEFAULT);
            for (CSVRecord record : parser2) {
                String firstName = record.get(0);
                String lastName = record.get(1);
                System.out.println("Parsed Record: " + firstName + " " + lastName);
            }

            // Read data using CSVParser
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT);
            for (CSVRecord record : parser) {
                /* read */ String firstName = record.get(0);
                System.out.println("Original Record First Name: " + firstName);
                break; // Ensure the read operation is executed only once
            }

            // More complex operations
            List<Integer> ages = new ArrayList<>();
            ages.add(30);
            ages.add(25);
            ages.add(40);

            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            System.out.println("Total age sum: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}