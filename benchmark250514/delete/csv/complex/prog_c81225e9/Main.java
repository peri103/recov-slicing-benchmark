import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT /* write */ .withQuote('"');
            
            // Create a CSVPrinter using the format
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write data to the CSVPrinter
            printer.printRecord("value1", "value2", "value3");
            
            // Flush the printer to ensure all data is written
            printer.flush();
            
            // Create a CSVRecord from the written data
            CSVRecord record = CSVFormat.DEFAULT.parse(writer.toString()).getRecords().get(0);

            // Additional complex operations
            List<String> complexList = new ArrayList<>();
            complexList.add("ComplexValue1");
            complexList.add("ComplexValue2");
            complexList.add("ComplexValue3");
            
            StringBuilder complexBuilder = new StringBuilder();
            for (String s : complexList) {
                complexBuilder.append(s).append(";");
            }
            
            String complexString = complexBuilder.toString();
            System.out.println("Complex String: " + complexString);

            // Intermediate operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
            
            // Read the record using the toString method
            /* read */ String recordString = record.toString();
            
            // Print the read value
            System.out.println(recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}