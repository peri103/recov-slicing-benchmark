import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withRecordSeparator("\n");

            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord(Arrays.asList("value1", "value2", "value3"));
            printer.flush();

            String csvString = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvString)).getRecords().get(0);
            /* read */ String recordString = record.toString();

            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}