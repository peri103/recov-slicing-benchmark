import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        List<String> additionalRecords = new ArrayList<>();
        
        try {
            // Initialize CSVFormat with a record separator
            CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
            /* write */ CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write a record using the CSVPrinter
            printer.printRecord("value1", "value2", "value3");
            printer.flush();

            // Unrelated code to add complexity
            for (int i = 0; i < 3; i++) {
                additionalRecords.add("extraValue" + i);
            }
            for (String record : additionalRecords) {
                printer.printRecord(record);
            }
            printer.flush();
            
            // More unrelated code
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }
            for (Integer num : numbers) {
                System.out.println("Number: " + num);
            }

            // Read the record using CSVRecord
            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            /* read */ String recordString = record.toString();
            
            // Output the read value
            System.out.println(recordString);

            // Additional unrelated processing
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}