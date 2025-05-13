import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Header1").withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Add some complex data structure
            ArrayList<Map<String, String>> dataList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                Map<String, String> data = new HashMap<>();
                data.put("Key" + i, "Value" + i);
                dataList.add(data);
            }

            // Write a comment into CSV
            /* write */ printer.printComment("This is a comment");

            // Process the dataList
            for (Map<String, String> data : dataList) {
                for (Map.Entry<String, String> entry : data.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }

            // Flush the printer
            printer.flush();
            String csvData = writer.toString();

            // Initialize CSVReader
            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = format.parse(reader);

            // Iterate over records and read the comment
            for (CSVRecord record : records) {
                // Perform some unrelated operations
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Sum: " + sum);

                // Read the comment
                /* read */ String comment = record.getComment();
                System.out.println(comment);
                break; // Ensure read is executed only once
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}