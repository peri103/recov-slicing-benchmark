import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize writer
            StringWriter writer = new StringWriter();
            
            // Create CSVFormat with comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Create CSVPrinter
            CSVPrinter printer = new CSVPrinter(writer, format);
            // Write data with a comment
            printer.printComment("This is a comment");
            printer.printRecord("value1", "value2", "value3");
            printer.flush();

            // Additional complex operations
            List<String> data = new ArrayList<>(Arrays.asList("data1", "data2", "data3"));
            for (String item : data) {
                printer.printRecord(item, item.length());
            }
            printer.flush();

            // Manipulate data
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            // Read the written data
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }

            // More complex operations
            List<String> processedData = new ArrayList<>();
            for (CSVRecord record : records) {
                processedData.add(record.get(0) + " processed");
            }
            System.out.println("Processed Data: " + processedData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}