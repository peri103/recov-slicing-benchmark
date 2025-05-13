import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            CSVFormat csvFormat = CSVFormat.DEFAULT
                /* write */ .withHeader("Name", "Age", "Country");

            // Prepare a StringWriter to capture the output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            
            // Print multiple records to the CSVPrinter
            List<List<String>> records = Arrays.asList(
                Arrays.asList("Alice", "30", "USA"),
                Arrays.asList("Bob", "25", "UK"),
                Arrays.asList("Charlie", "35", "Canada")
            );
            
            for (List<String> record : records) {
                csvPrinter.printRecord(record);
            }
            csvPrinter.flush();

            // Parse the written CSV content
            String csvContent = writer.toString();
            CSVRecord csvRecord = CSVFormat.DEFAULT
                .withHeader("Name", "Age", "Country")
                .parse(new java.io.StringReader(csvContent))
                .iterator().next();

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : CSVFormat.DEFAULT
                    .withHeader("Name", "Age", "Country")
                    .parse(new java.io.StringReader(csvContent))) {
                sumOfAges += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Check if a header is set
            /* read */ boolean isSet = csvRecord.isSet("Name");
            System.out.println("Is 'Name' header set? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}