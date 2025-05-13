import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a StringWriter to capture the output
            StringWriter writer = new StringWriter();

            // Initialize the CSVPrinter with the writer and a CSV format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment using the printComment method
            /* write */ printer.printComment("This is a comment");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Read the comment using the CSVRecord getComment method
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            for (CSVRecord record : records) {
                if (record.getComment() != null) {
                    /* read */ String comment = record.getComment();
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}