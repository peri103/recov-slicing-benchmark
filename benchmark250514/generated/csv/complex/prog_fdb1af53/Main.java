import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter with StringWriter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();

            // Additional complexity: Working with ArrayList
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");

            // Process data in ArrayList
            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }

            // Use StringReader to simulate reading the CSV data
            Reader reader = new StringReader(writer.toString());
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();

            // More complexity: Manipulating CSV records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record.toString());
            }

            // Read the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }

            // Additional complexity: Calculating sum of integers
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum: " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}