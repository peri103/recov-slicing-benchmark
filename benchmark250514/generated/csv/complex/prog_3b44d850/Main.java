import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize necessary objects
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

        // Write a record using CSVPrinter
        /* write */ printer.printRecord("value1", "value2", "value3");
        printer.close();

        // Additional unrelated code to make the program more complex
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println(str);
        }

        // Another CSV operation
        StringWriter writer2 = new StringWriter();
        CSVPrinter printer2 = new CSVPrinter(writer2, CSVFormat.DEFAULT);
        printer2.printRecord("extra1", "extra2", "extra3");
        printer2.close();

        StringReader reader2 = new StringReader(writer2.toString());
        List<CSVRecord> records2 = CSVFormat.DEFAULT.parse(reader2).getRecords();
        String extraValue = records2.get(0).get(1);
        System.out.println(extraValue);

        // Read the record using CSVRecord
        StringReader reader = new StringReader(writer.toString());
        List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();
        /* read */ String value = records.get(0).get(0);

        // Output the read value
        System.out.println(value);

        // Further complexity with a loop and conditional statements
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }
}