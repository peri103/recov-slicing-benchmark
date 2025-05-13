import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Additional unrelated code
            List<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            dataList.add("Data3");
            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }
            
            // Parsing CSV data
            StringReader reader = new StringReader(writer.toString());
            Iterable<CSVRecord> records = format.parse(reader);
            for (CSVRecord record : records) {
                // Additional unrelated code
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += i;
                }
                System.out.println("Sum: " + sum);

                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
                
                // More unrelated code
                List<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    numbers.add(i * 2);
                }
                for (Integer number : numbers) {
                    System.out.println("Number: " + number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}