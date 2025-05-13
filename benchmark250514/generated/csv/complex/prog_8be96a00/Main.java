import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Create a CSV format object with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Step 2: Use StringWriter to hold CSV data
            StringWriter writer = new StringWriter();
            
            // Step 3: Write data with a comment using CSVPrinter
            try (CSVPrinter printer = new CSVPrinter(writer, format)) {
                printer.printComment("This is a comment");
                printer.printRecord("Column1", "Column2");
                printer.printRecord("Data1", "Data2");
            }
            
            // Step 4: Add unrelated code to make the program more complex
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }
            
            HashMap<String, String> map = new HashMap<>();
            map.put("Key1", "Value1");
            map.put("Key2", "Value2");
            
            for (int num : numbers) {
                System.out.println("Processing number: " + num);
            }
            
            for (String key : map.keySet()) {
                System.out.println("Map key: " + key + ", value: " + map.get(key));
            }
            
            // Step 5: Read the CSV data
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            
            // Step 6: Parse the CSV data and read the comment
            Iterable<CSVRecord> records = format.parse(reader);
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment read from CSV: " + comment);
                    break; // Ensure the read operation is performed only once
                }
            }
            
            // Step 7: Add more unrelated code for complexity
            ArrayList<String> strings = new ArrayList<>();
            strings.add("Alpha");
            strings.add("Beta");
            strings.add("Gamma");
            
            for (String str : strings) {
                System.out.println("String value: " + str);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}