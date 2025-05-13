import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare to write to a StringWriter
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT;

            // Initialize CSVPrinter
            CSVPrinter csvPrinter = new CSVPrinter(writer, format);

            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();

            // Read the comment using CSVRecord
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