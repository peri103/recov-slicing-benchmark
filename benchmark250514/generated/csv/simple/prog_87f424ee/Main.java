import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Prepare a sample CSV content
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord(Arrays.asList("column1", "column2"));
            printer.printRecord(Arrays.asList("value1", "value2"));
            printer.flush();

            // Read the CSV content
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = new CSVParser(reader, format);

            // Iterate over the records
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }

            // Close resources
            parser.close();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}