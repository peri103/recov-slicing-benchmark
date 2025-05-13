import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVPrinter
        StringWriter stringWriter = new StringWriter();
        CSVPrinter csvPrinter = null;
        
        try {
            csvPrinter = new CSVPrinter(stringWriter, CSVFormat.DEFAULT);
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Initialize CSVParser
        String csvData = stringWriter.toString();
        CSVParser parser;
        
        // Create and manipulate some collections
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            arrayList.add("Item" + i);
            hashMap.put("Key" + i, i);
        }
        
        // Perform operations on collections
        for (String item : arrayList) {
            System.out.println("ArrayList item: " + item);
        }
        
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Parse CSV data
        try {
            parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : parser) {
                /* read */ String value = csvRecord.get(0);
                System.out.println("CSVRecord value: " + value);
                break; // Ensure the read line is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Further operations unrelated to CSV
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append("Appending ").append(i).append(" ");
        }
        System.out.println("StringBuilder content: " + stringBuilder.toString());
    }
}