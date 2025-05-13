import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');
            
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2");
            printer.flush();
            
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}