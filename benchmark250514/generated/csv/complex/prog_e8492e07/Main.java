import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.print("Hello, World");
            csvPrinter.flush();
            
            ArrayList<String> additionalData = new ArrayList<>();
            additionalData.add("Data1");
            additionalData.add("Data2");
            additionalData.add("Data3");

            for (String data : additionalData) {
                csvPrinter.print(data);
            }
            csvPrinter.flush();
            
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            
            int sumLength = 0;
            for (int i = 1; i < record.size(); i++) {
                sumLength += record.get(i).length();
            }
            
            /* read */ String value = record.get(0);
            System.out.println(value);
            
            System.out.println("Sum of lengths of additional data: " + sumLength);
            
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            
            int total = 0;
            for (int num : numbers) {
                total += num;
            }
            
            System.out.println("Total of numbers: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}