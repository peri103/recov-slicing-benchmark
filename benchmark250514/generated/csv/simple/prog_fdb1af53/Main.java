import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVPrinter with StringWriter
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();

            // Use StringReader to simulate reading the CSV data
            Reader reader = new StringReader(writer.toString());
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();

            // Read the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}