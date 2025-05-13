import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StringWriter out = new StringWriter();
        CSVPrinter printer = null;
        CSVParser parser = null;
        List<String> dataList = new ArrayList<>();
        Map<String, Integer> dataMap = new HashMap<>();
        
        try {
            printer = new CSVPrinter(out, CSVFormat.DEFAULT.withCommentMarker('#'));
            dataList.add("Data1");
            dataList.add("Data2");
            dataMap.put("Key1", 100);
            dataMap.put("Key2", 200);
            
            for (String data : dataList) {
                printer.printRecord(data);
            }
            
            /* write */ printer.printComment("This is a comment");
            printer.flush();
            
            parser = new CSVParser(new StringReader(out.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            for (CSVRecord record : parser) {
                if (record.getRecordNumber() == 1) {
                    String firstRecord = record.get(0);
                    System.out.println("First record: " + firstRecord);
                }
                
                // Perform some operations with dataMap
                for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
                
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (printer != null) printer.close();
                if (parser != null) parser.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Additional complex operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);
    }
}