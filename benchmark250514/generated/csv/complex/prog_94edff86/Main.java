import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator("\n");

            // Use StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record
            printer.printRecord("value1", "value2", "value3");
            printer.flush();

            // Convert the written content to a CSVRecord
            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);

            // Additional complex operations
            List<String> list = new ArrayList<>();
            list.add("extra1");
            list.add("extra2");
            list.add("extra3");

            for (String item : list) {
                printer.printRecord(item, item.toUpperCase(), item.toLowerCase());
            }
            printer.flush();

            // Read from CSVRecord
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

            // Further operations
            List<String> finalList = new ArrayList<>(list);
            finalList.add(recordString);
            for (String item : finalList) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}