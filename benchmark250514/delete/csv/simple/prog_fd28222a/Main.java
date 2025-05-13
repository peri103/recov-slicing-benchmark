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
            /* write */ CSVFormat autoFlushFormat = format.withAutoFlush(true);
            CSVPrinter printer = new CSVPrinter(writer, autoFlushFormat);
            printer.printRecord("value1", "value2", "value3");
            
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(csvData).getRecords().get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}