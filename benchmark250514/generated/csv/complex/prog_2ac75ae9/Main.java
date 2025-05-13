import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            /* write */ printer.printComment("This is a comment");
            printer.flush();
            
            String csvContent = writer.toString();
            StringReader reader = new StringReader(csvContent);
            CSVParser parser = new CSVParser(reader, format);

            // Unrelated code to increase complexity
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("First");
            stringList.add("Second");
            stringList.add("Third");

            for (String str : stringList) {
                System.out.println("String from list: " + str);
            }

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Further unrelated code
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }

            for (Integer num : numbers) {
                System.out.println("Number: " + num);
            }

            // Original read method
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
            
            parser.close();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}