import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(";");

            // Use StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write multiple records to the CSVPrinter
            printer.printRecord("Name", "Age", "Country");
            printer.printRecord("Alice", "30", "USA");
            printer.printRecord("Bob", "25", "Canada");

            // Flush the printer to ensure all data is written
            printer.flush();

            // Additional operations to make the program complex
            List<String> dataList = new ArrayList<>();
            dataList.add("Extra");
            dataList.add("Data");
            dataList.add("Here");

            for (String data : dataList) {
                printer.printRecord(data);
            }

            printer.flush();

            // Read the output as a CSVRecord
            String csvData = writer.toString();
            CSVParser parser = CSVFormat.DEFAULT.parse(csvData);
            List<CSVRecord> records = parser.getRecords();

            for (CSVRecord rec : records) {
                System.out.println(rec);
            }

            // Perform some unrelated computations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);

            // Read the CSVRecord using the toString method
            CSVRecord record = records.get(0);
            /* read */ String recordString = record.toString();
            System.out.println("First Record: " + recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}