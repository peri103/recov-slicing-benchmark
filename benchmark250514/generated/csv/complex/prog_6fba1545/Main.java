import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Additional complex operations
            List<String> dataList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                dataList.add("Data" + i);
            }

            for (String data : dataList) {
                csvPrinter.print(data);
            }

            // Write operation
            /* write */ csvPrinter.print("Hello");

            csvPrinter.flush();
            csvPrinter.close();

            // Additional operations
            List<String> processedData = new ArrayList<>();
            for (String data : dataList) {
                processedData.add(data.toUpperCase());
            }

            for (String data : processedData) {
                System.out.println("Processed: " + data);
            }

            // Read operation
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);
            
            System.out.println(value);

            // More complex operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}