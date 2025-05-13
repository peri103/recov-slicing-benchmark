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
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Use StringWriter to simulate writing to a file
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a record with a comment
            printer.printRecord("value1", "value2");
            writer.append("# This is a comment\n");
            printer.printRecord("value3", "value4");
            printer.flush();

            // Simulate reading the CSV content
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Read the comment from the CSV content
            for (CSVRecord record : records) {
                String comment = /* read */ record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}