import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;

        try {
            /* write */ format = format.withHeader("Name", "Age", "City");
            CSVPrinter printer = new CSVPrinter(writer, format);

            List<String> record1 = Arrays.asList("Alice", "30", "New York");
            printer.printRecord(record1);

            printer.flush();
            printer.close();

            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.withHeader("Name", "Age", "City").parse(new java.io.StringReader(csvContent)).getRecords().get(0);

            /* read */ boolean isSet = record.isSet("Name");
            System.out.println(isSet); // Should print true as "Name" header was set and used
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}