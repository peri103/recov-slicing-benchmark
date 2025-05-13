import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Data1");
            dataList.add("Data2");
            
            for (String data : dataList) {
                printer.printRecord(data);
            }
            
            /* write */ printer.printComment("This is a comment");
            printer.flush();
            
            String csvContent = writer.toString();
            System.out.println("CSV Content:\n" + csvContent);
            
            StringReader reader = new StringReader(csvContent);
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();
            
            List<String> extractedData = new ArrayList<>();
            for (CSVRecord record : records) {
                if (!record.hasComment()) {
                    extractedData.add(record.get(0));
                }
            }
            
            System.out.println("Extracted Data: " + extractedData);
            
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Read Comment: " + comment);
                }
            }
            
            // Additional complex operations
            int sum = 0;
            for (String data : extractedData) {
                sum += data.length();
            }
            System.out.println("Sum of lengths: " + sum);
            
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numberList.add(i * 10);
            }
            
            int total = 0;
            for (int number : numberList) {
                total += number;
            }
            System.out.println("Total of numberList: " + total);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}