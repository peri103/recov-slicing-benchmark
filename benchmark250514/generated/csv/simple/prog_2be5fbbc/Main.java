import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord(Arrays.asList("field1", "field2", "field3"));
            printer.flush();

            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            /* read */ String recordString = record.toString();
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}