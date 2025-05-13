import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write data
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Additional complexity: Using an ArrayList to store some data
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");
            
            // Write data using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();
            
            // Additional complexity: Process and print data from the ArrayList
            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }
            
            // Parse the written CSV data
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            
            // Additional complexity: Perform some operations on the parsed data
            ArrayList<String> parsedDataList = new ArrayList<>();
            for (CSVRecord rec : parser) {
                parsedDataList.add(rec.get(0));
            }
            System.out.println("Parsed Data List: " + parsedDataList);
            
            // Read the data using CSVRecord
            /* read */ String value = record.get(0);
            System.out.println("Read Value: " + value);
            
            // Close resources
            csvPrinter.close();
            parser.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}