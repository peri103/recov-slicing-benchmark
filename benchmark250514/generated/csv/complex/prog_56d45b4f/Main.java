import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = null;
        CSVParser csvParser = null;
        
        try {
            // Initialize CSVPrinter
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write data
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();
            
            // Additional operations to increase complexity
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }
            
            int sum = 0;
            for (Integer num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
            List<String> data = new ArrayList<>();
            data.add("extra1");
            data.add("extra2");
            csvPrinter.printRecord(data);
            csvPrinter.flush();
            
            // Read the written data
            StringReader reader = new StringReader(writer.toString());
            csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            List<CSVRecord> records = csvParser.getRecords();
            
            // Assuming we want to read the first value of the first record
            /* read */ String value = records.get(0).get(0);
            System.out.println("Read value: " + value);
            
            // Additional operations after reading
            for (CSVRecord record : records) {
                for (String field : record) {
                    System.out.println("Field: " + field);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.close();
                }
                if (csvParser != null) {
                    csvParser.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}