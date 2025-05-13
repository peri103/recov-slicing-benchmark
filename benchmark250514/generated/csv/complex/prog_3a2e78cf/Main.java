import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        
        ArrayList<String> dataList = new ArrayList<>();
        HashMap<String, Integer> dataMap = new HashMap<>();
        
        // Adding some data to dataList and dataMap
        dataList.add("apple");
        dataList.add("banana");
        dataList.add("cherry");
        
        dataMap.put("apple", 1);
        dataMap.put("banana", 2);
        dataMap.put("cherry", 3);
        
        // Manipulating dataList
        for (String item : dataList) {
            if (item.startsWith("a")) {
                System.out.println("Starts with 'a': " + item);
            }
        }
        
        // Manipulating dataMap
        int sum = 0;
        for (Integer value : dataMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in dataMap: " + sum);
        
        /* write */ format = format.withQuote('"');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2");
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String csvData = writer.toString();
        CSVRecord record = null;
        
        // Further operations with dataList
        dataList.add("date");
        dataList.remove("banana");
        
        // Further operations with dataMap
        dataMap.put("date", 4);
        dataMap.remove("banana");
        
        try {
            record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /* read */ String recordString = record.toString();
        System.out.println(recordString);
        
        // Displaying contents of dataList and dataMap
        System.out.println("Contents of dataList: " + dataList);
        System.out.println("Contents of dataMap: " + dataMap);
    }
}