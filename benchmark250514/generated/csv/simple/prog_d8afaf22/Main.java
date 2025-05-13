import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter csvPrinter = new CSVPrinter(writer, format);

            /* write */ csvPrinter.printComment("This is a comment");

            csvPrinter.flush();
            String csvData = writer.toString();

            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(new java.io.StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}