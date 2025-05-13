import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a writer and a CSVPrinter
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record to the CSVPrinter
            List<String> record = Arrays.asList("value1", "value2");
            printer.printRecord(record);
            printer.flush();

            // Read the comment from the CSVRecord
            String csvContent = writer.toString();
            CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords().get(0);
            /* read */ String comment = csvRecord.getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}