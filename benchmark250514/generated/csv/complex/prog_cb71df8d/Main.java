import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#').withQuoteMode(QuoteMode.ALL);
        
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("Data1");
        dataList.add("Data2");
        dataList.add("Data3");

        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            for (String data : dataList) {
                printer.printRecord(data);
            }
            /* write */ printer.printComment("This is a comment");
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String csvData = writer.toString();
        
        try {
            Reader input = new StringReader(csvData);
            CSVParser parser = new CSVParser(input, format);
            for (CSVRecord record : parser) {
                String firstColumn = record.get(0);
                System.out.println("Record: " + firstColumn);
                
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated operations to increase complexity
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number at index " + i + ": " + numberList.get(i));
        }
    }
}