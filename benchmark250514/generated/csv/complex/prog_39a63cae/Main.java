import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare to write CSV data
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data to CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Additional logic: create a list and populate it
            List<String> additionalList = new ArrayList<>();
            additionalList.add("First Element");
            additionalList.add("Second Element");

            // Perform some operations on the list
            for (String element : additionalList) {
                System.out.println("Processing: " + element);
            }

            // Parse the written CSV data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);

            // Additional logic: manipulate the list further
            additionalList.add("Third Element");
            additionalList.remove(0);

            // Read the data from the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);

            // Print the value read from the CSV
            System.out.println("CSV Value: " + value);

            // Further operations on the list
            for (String element : additionalList) {
                System.out.println("Final List Element: " + element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}