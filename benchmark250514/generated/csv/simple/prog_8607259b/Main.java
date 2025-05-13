import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a comment to the CSV
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Read the comment back from the CSV
            String csvContent = writer.toString();
            StringReader reader = new StringReader(csvContent);
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();

            // Assuming the comment is associated with the first record
            // This is a simplification, as CSV does not directly store comments with records
            String comment = null;
            for (CSVRecord record : records) {
                comment = /* read */ record.getComment();
                if (comment != null) break;
            }

            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}