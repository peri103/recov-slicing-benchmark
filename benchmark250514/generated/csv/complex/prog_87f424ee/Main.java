import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Prepare a sample CSV content
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord(Arrays.asList("column1", "column2"));
            printer.printRecord(Arrays.asList("value1", "value2"));
            printer.flush();

            // Create a map to store parsed records
            Map<Integer, CSVRecord> recordMap = new HashMap<>();

            // Read the CSV content
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = new CSVParser(reader, format);

            // Iterate over the records and store them in the map
            int index = 0;
            for (CSVRecord record : parser) {
                recordMap.put(index++, record);
            }

            // Process records from the map
            for (Map.Entry<Integer, CSVRecord> entry : recordMap.entrySet()) {
                CSVRecord record = entry.getValue();
                System.out.println("Processing record at index: " + entry.getKey());
                System.out.println("Column 1: " + record.get(0));
                System.out.println("Column 2: " + record.get(1));
            }

            // Retrieve and print the comment from the first record
            CSVRecord firstRecord = recordMap.get(0);
            /* read */ String comment = firstRecord.getComment();
            if (comment != null) {
                System.out.println("Header Comment: " + comment);
            }

            // Close resources
            parser.close();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}