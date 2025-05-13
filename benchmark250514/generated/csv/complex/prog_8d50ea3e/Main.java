import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("extra1");
        dataList.add("extra2");

        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();

            String csvData = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);

            // Perform some unrelated operations
            dataList.add("extra3");
            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }

            // Some more operations
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);

            /* read */ String value = record.get(0);
            System.out.println(value);

            // Additional unrelated logic
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}