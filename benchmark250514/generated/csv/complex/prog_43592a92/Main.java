import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVFormat object and set the record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator("\n");

            // Create a CSVPrinter to write data to the StringWriter using the specified format
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write multiple records to the CSVPrinter
            printer.printRecord("Name", "Age", "Location");
            printer.printRecord("Alice", 30, "Wonderland");
            printer.printRecord("Bob", 25, "Builderland");
            printer.flush();

            // Unrelated complex code: Handling a list of strings
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            stringList.add("!");

            StringBuilder sb = new StringBuilder();
            for (String str : stringList) {
                sb.append(str).append(" ");
            }
            System.out.println(sb.toString().trim());

            // Read the CSV data from the StringWriter
            String csvData = writer.toString();

            // Split the CSV data into individual records
            String[] records = csvData.split("\n");

            // Unrelated complex code: Processing CSV records
            List<CSVRecord> csvRecords = new ArrayList<>();
            for (int i = 1; i < records.length; i++) {
                CSVRecord record = CSVFormat.DEFAULT.parse(new StringReader(records[i])).getRecords().get(0);
                csvRecords.add(record);
            }

            for (CSVRecord rec : csvRecords) {
                System.out.println("Processing Record: " + rec.toString());
            }

            // Create a CSVRecord object from the first record (header)
            CSVRecord record = CSVFormat.DEFAULT.parse(new StringReader(records[1])).getRecords().get(0);

            // Read the CSVRecord using the toString method
            /* read */ String recordString = record.toString();

            // Print the output
            System.out.println("Read CSV Record: " + recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}