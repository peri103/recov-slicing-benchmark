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
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a record using CSVPrinter
            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            // Create an ArrayList to store additional CSV data
            ArrayList<String[]> additionalData = new ArrayList<>();
            additionalData.add(new String[]{"Alice", "Smith", "25"});
            additionalData.add(new String[]{"Bob", "Johnson", "40"});

            // Print additional CSV data
            for (String[] data : additionalData) {
                csvPrinter.printRecord(data);
            }
            csvPrinter.flush();

            // Process the CSV data to calculate average age
            int totalAge = 0;
            int count = 0;
            String csvData = writer.toString();
            CSVParser csvParser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            for (CSVRecord record : csvParser) {
                totalAge += Integer.parseInt(record.get(2));
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);

            // Read the original record using CSVParser
            CSVRecord csvRecord = csvParser.getRecords().get(0);

            // Read a specific value from the CSVRecord
            /* read */ String firstName = csvRecord.get(0);
            System.out.println("First Name: " + firstName);

            // Close resources
            csvPrinter.close();
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}