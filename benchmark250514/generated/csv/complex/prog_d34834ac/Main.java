import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a header comment
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record to the CSV
            printer.printRecord("Column1", "Column2");
            printer.printRecord("Value1", "Value2");
            printer.flush();

            // Parse the CSV output
            CSVParser parser = CSVParser.parse(writer.toString(), format);

            // Additional complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }

            Map<String, Integer> map = new HashMap<>();
            for (Integer num : numbers) {
                map.put("Key" + num, num * num);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            // Read the comment from the first record
            List<CSVRecord> records = parser.getRecords();
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println(comment);

            // More complex operations
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                strings.add("String" + i);
            }

            for (String str : strings) {
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}