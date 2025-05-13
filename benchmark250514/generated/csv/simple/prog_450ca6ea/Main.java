import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();

            // Create a CSVFormat instance and write a header
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeader("Name", "Age", "Country");

            // Use CSVPrinter to write some data
            try (CSVPrinter printer = new CSVPrinter(writer, format)) {
                printer.printRecord("Alice", "30", "USA");
                printer.printRecord("Bob", "25", "UK");
            }

            // Read the generated CSV data
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader("Name", "Age", "Country")
                    .withFirstRecordAsHeader()
                    .parse(reader);

            // Access the first record and check if a column is set
            CSVRecord firstRecord = records.iterator().next();
            /* read */ boolean isSet = firstRecord.isSet("Age");
            System.out.println("Is 'Age' column set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}