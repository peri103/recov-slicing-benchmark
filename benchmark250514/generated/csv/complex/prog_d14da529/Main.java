import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator(";");
            
            // Use StringWriter to capture the output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write data using the format
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2", "value3");
            printer.flush();
            
            // Additional code to make the program more complex
            List<String> complexList = new ArrayList<>();
            complexList.add("extra1");
            complexList.add("extra2");
            complexList.add("extra3");
            
            for (String item : complexList) {
                System.out.println("Processing item: " + item);
            }
            
            // Convert the written data to CSVRecord for reading
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
            
            // Read the CSVRecord as a string
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
            
            // Additional operations on complexList
            for (int i = 0; i < complexList.size(); i++) {
                System.out.println("Final item: " + complexList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}