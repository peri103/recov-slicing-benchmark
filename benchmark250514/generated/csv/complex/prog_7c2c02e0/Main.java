import java.io.StringWriter;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write the CSV data
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment using the CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Create an ArrayList for additional data manipulation
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");

            // Create a HashMap to store additional key-value pairs
            HashMap<String, Integer> dataMap = new HashMap<>();
            dataMap.put("Key1", 100);
            dataMap.put("Key2", 200);
            dataMap.put("Key3", 300);

            // Iterate over the ArrayList and do some operations
            for (String data : dataList) {
                System.out.println("Processing: " + data);
                if (dataMap.containsKey(data)) {
                    System.out.println("Value: " + dataMap.get(data));
                }
            }

            // Flush and close the printer to ensure all data is written
            csvPrinter.flush();
            csvPrinter.close();

            // Parse the written CSV data to read it back
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT.withCommentMarker('#'));

            // Assuming we have a record to read from, get the comment
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            // Additional processing after reading the comment
            int sum = 0;
            for (int value : dataMap.values()) {
                sum += value;
            }
            System.out.println("Sum of values in dataMap: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}