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
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            /* write */ printer.printComment("This is a comment");
            printer.flush();

            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}