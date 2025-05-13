import java.io.StringWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance using the StringWriter
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Create an ArrayList to store some data
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");
            
            // Print all elements of the ArrayList to the CSV
            for (String data : dataList) {
                csvPrinter.print(data);
            }
            
            // Use the write method to print a specific value to the CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();  // Ensure the data is flushed to the writer
            
            // Perform some unrelated calculations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);
            
            // Parse the written CSV content using CSVParser
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            
            // Read the first record and the first value using the read method
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(3);  // Get the value at index 3, which is "Hello, World!"
            
            // Print the read value
            System.out.println(value);
            
            // Additional operations on the dataList
            for (String data : dataList) {
                System.out.println("Data List Item: " + data);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}