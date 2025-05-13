import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("value1", "value2");
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String csvData = writer.toString();
        CSVRecord record = null;
        
        try {
            record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /* read */ String recordString = record.toString();
        System.out.println(recordString);
    }
}