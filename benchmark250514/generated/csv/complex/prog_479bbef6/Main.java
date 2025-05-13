import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");
            
            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();
            
            // Create a complex data structure
            Map<String, List<Integer>> complexData = new HashMap<>();
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 10);
            }
            complexData.put("numbers", numberList);
            
            // Manipulate the complex data structure
            for (Map.Entry<String, List<Integer>> entry : complexData.entrySet()) {
                System.out.println("Key: " + entry.getKey());
                for (Integer num : entry.getValue()) {
                    System.out.println("Value: " + num);
                }
            }
            
            // Read the comment using CSVRecord
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords().get(0);
            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println(comment);
            
            // Further manipulation of complex data
            if (complexData.containsKey("numbers")) {
                List<Integer> retrievedNumbers = complexData.get("numbers");
                int sum = 0;
                for (Integer num : retrievedNumbers) {
                    sum += num;
                }
                System.out.println("Sum of numbers: " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}