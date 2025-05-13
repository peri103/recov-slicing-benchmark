import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                csvPrinter.printRecord(entry.getKey(), entry.getValue());
            }
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();
            csvPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String csvContent = writer.toString();
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            for (CSVRecord record : parser) {
                String key = record.get(0);
                String value = record.get(1);
                System.out.println("Key: " + key + ", Value: " + value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is: " + sum);

        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            for (CSVRecord record : parser) {
                /* read */ String value = record.get(0);
                System.out.println("Read value: " + value);
                break; // Ensure this line is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}