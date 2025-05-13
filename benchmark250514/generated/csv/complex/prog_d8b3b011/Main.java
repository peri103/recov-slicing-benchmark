import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter with StringWriter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Initialize additional data structures
            ArrayList<String> stringList = new ArrayList<>();
            LinkedList<Integer> numberList = new LinkedList<>();
            
            // Populate the data structures
            stringList.add("First");
            stringList.add("Second");
            numberList.add(100);
            numberList.add(200);

            // Write a value to CSV
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            // Perform operations on the data structures
            for (String str : stringList) {
                System.out.println("String List Item: " + str);
            }

            for (Integer num : numberList) {
                System.out.println("Number List Item: " + num);
            }

            // Read the value from CSV
            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            // Additional operations before reading
            stringList.add("Third");
            numberList.add(300);
            for (String str : stringList) {
                System.out.println("Updated String List Item: " + str);
            }
            for (Integer num : numberList) {
                System.out.println("Updated Number List Item: " + num);
            }

            /* read */ String value = record.get(0);

            // Print the value read from CSV
            System.out.println("CSV Value: " + value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}