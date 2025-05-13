import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize writer
            StringWriter writer = new StringWriter();
            
            // Create CSVFormat with comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Create CSVPrinter
            CSVPrinter printer = new CSVPrinter(writer, format);
            // Write data with a comment
            printer.printComment("This is a comment");
            printer.printRecord("value1", "value2", "value3");
            printer.flush();

            // Read the written data
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}