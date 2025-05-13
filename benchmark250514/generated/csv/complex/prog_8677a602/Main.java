import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        try {
            // Adding header comments
            /* write */ csvFormat = csvFormat.withHeaderComments("This is a comment");

            // Writing to CSV
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            csvPrinter.printRecord("Header1", "Header2");
            csvPrinter.printRecord("Value1", "Value2");
            csvPrinter.close();

            // Unrelated complex operations
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numberList.add(i * 2);
            }

            int sum = 0;
            for (int num : numberList) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // More complex operations with unrelated CSV parsing
            StringWriter anotherWriter = new StringWriter();
            CSVFormat anotherCSVFormat = CSVFormat.DEFAULT.withHeader("Col1", "Col2");
            CSVPrinter anotherCSVPrinter = new CSVPrinter(anotherWriter, anotherCSVFormat);
            anotherCSVPrinter.printRecord("Data1", "Data2");
            anotherCSVPrinter.printRecord("Data3", "Data4");
            anotherCSVPrinter.close();

            Reader anotherReader = new StringReader(anotherWriter.toString());
            CSVParser anotherCSVParser = new CSVParser(anotherReader, anotherCSVFormat);
            List<CSVRecord> anotherRecords = anotherCSVParser.getRecords();
            for (CSVRecord record : anotherRecords) {
                System.out.println("Record: " + record);
            }
            anotherCSVParser.close();

            // Reading from the original CSV
            Reader reader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(reader, csvFormat);
            List<CSVRecord> records = csvParser.getRecords();

            // Accessing the comment
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);

            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}