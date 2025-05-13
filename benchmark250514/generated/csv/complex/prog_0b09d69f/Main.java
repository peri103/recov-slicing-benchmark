import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Create an ArrayList and add some elements
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");

            // Iterate over the ArrayList and print each element using CSVPrinter
            for (String data : dataList) {
                csvPrinter.print(data);
            }

            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(csvData, CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Use CSVRecord to read data
            /* read */ String value = record.get(0);
            System.out.println(value);

            // More unrelated logic
            int product = 1;
            for (int i = 1; i <= 5; i++) {
                product *= i;
            }
            System.out.println("Product of numbers from 1 to 5: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}