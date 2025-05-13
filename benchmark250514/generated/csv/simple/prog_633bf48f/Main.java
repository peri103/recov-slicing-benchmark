import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ printer.printRecord("value1", "value2", "value3");
            printer.flush();

            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            CSVRecord record = records.get(0);
            /* read */ String value = record.get(0);
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}