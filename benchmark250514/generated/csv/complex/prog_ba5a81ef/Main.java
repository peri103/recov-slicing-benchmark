import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            /* write */ printer.printComment("This is a comment");
            printer.flush();

            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Unrelated code to make the program more complex
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numberList.add(i * 2);
            }

            int sum = 0;
            for (int num : numberList) {
                sum += num;
            }

            System.out.println("Sum of numbers: " + sum);

            // Additional CSV manipulation
            StringWriter writer2 = new StringWriter();
            CSVPrinter printer2 = new CSVPrinter(writer2, CSVFormat.DEFAULT);
            printer2.printRecord("Header1", "Header2");
            printer2.printRecord("Value1", "Value2");
            printer2.flush();

            List<CSVRecord> records2 = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer2.toString())).getRecords();
            for (CSVRecord record : records2) {
                System.out.println("Record: " + record);
            }

            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}