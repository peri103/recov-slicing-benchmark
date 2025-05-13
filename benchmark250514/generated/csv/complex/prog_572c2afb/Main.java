import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter with default format
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a value using CSVPrinter
            /* write */ csvPrinter.print("Hello, World!");

            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();

            // Prepare some unrelated data structures
            ArrayList<Integer> numberList = new ArrayList<>();
            HashMap<String, Integer> nameMap = new HashMap<>();

            // Populate the ArrayList
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 2);
            }

            // Populate the HashMap
            nameMap.put("Alice", 30);
            nameMap.put("Bob", 25);

            // Perform operations on the ArrayList
            for (int num : numberList) {
                System.out.println("Number: " + num);
            }

            // Perform operations on the HashMap
            for (String name : nameMap.keySet()) {
                System.out.println(name + " is " + nameMap.get(name) + " years old.");
            }

            // Read the written CSV data
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);

            // Create a CSVParser to parse the CSV data
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

            // Get the first record
            CSVRecord record = csvParser.getRecords().get(0);

            // Read the value using CSVRecord
            /* read */ String value = record.get(0);

            // Print the read value
            System.out.println(value);

            // Close the parser
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}