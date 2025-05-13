import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            ArrayList<String> additionalValues = new ArrayList<>();
            additionalValues.add("extra1");
            additionalValues.add("extra2");
            
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            for (String val : additionalValues) {
                csvPrinter.printRecord(val);
            }
            csvPrinter.flush();
            
            String csvData = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);
            
            int sum = 0;
            for (int i = 0; i < records.size(); i++) {
                sum += records.get(i).size();
            }
            System.out.println("Total number of fields: " + sum);
            
            /* read */ String value = record.get(0);
            System.out.println(value);
            
            for (CSVRecord rec : records) {
                for (int i = 0; i < rec.size(); i++) {
                    System.out.println("Record value: " + rec.get(i));
                }
            }
            
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }
            int total = 0;
            for (Integer number : numbers) {
                total += number;
            }
            System.out.println("Sum of numbers: " + total);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}