import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Use a StringWriter to capture the CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);
            printer.printRecord("Column1", "Column2");
            printer.printRecord("Value1", "Value2");
            printer.flush();

            // Additional unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Key1", 100);
            map.put("Key2", 200);

            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }

            System.out.println("Sum of numbers: " + sum);

            // Read the CSV content using CSVParser
            StringReader in = new StringReader(out.toString());
            CSVParser parser = CSVParser.parse(in, format);

            // Assume we want to read the comment from the first record
            CSVRecord record = parser.getRecords().get(0);

            // Additional operations after reading
            for (CSVRecord rec : parser) {
                System.out.println("Record: " + rec);
            }

            /* read */ String comment = record.getComment();
            System.out.println("Header Comment: " + comment);

            // More unrelated operations
            for (String key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }

            // Another CSV operation
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withHeader("ColA", "ColB");
            StringWriter anotherOut = new StringWriter();
            CSVPrinter anotherPrinter = new CSVPrinter(anotherOut, anotherFormat);
            anotherPrinter.printRecord("Data1", "Data2");
            anotherPrinter.flush();

            System.out.println("Another CSV: " + anotherOut.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}