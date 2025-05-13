import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ printer.printComment("This is a test comment");
            
            // Flush the printer to ensure all data is written
            printer.flush();

            // Perform unrelated operations to make the program more complex
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");
            
            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }
            
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read the CSV output using a StringReader
            StringReader reader = new StringReader(writer.toString());
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);

            // Read the comment from the CSVRecord
            String comment = null;
            for (CSVRecord record : records) {
                /* read */ comment = record.getComment();
                break; // Ensure the read method is executed only once
            }
            
            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}