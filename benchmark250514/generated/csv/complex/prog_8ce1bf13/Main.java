import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));
            
            // Perform some unrelated operations
            List<String> randomList = new ArrayList<>();
            randomList.add("Alpha");
            randomList.add("Beta");
            randomList.add("Gamma");
            
            for (String item : randomList) {
                System.out.println("Processing item: " + item);
            }
            
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();  // Ensure all data is written to the StringWriter
            
            // More unrelated operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * i);
            }
            
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of squares: " + sum);
            
            // Read the written comment using CSVRecord
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            
            CSVRecord firstRecord = records.iterator().next();
            /* read */ String comment = firstRecord.getComment();
            
            System.out.println("CSV Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}