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
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            /* write */ CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("header1", "header2");
            printer.printRecord("value1", "value2");
            printer.flush();
            printer.close();

            // Parse the CSV content
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            /* read */ String comment = records.get(0).getComment();  // Assuming the first record contains the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}