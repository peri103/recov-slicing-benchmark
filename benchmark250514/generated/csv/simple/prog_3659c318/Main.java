import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = null;
        CSVRecord csvRecord = null;
        
        try {
            // Initialize CSVPrinter
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));
            
            // Write a comment
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();
            
            // Read the comment
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();
            
            // Assuming the comment is associated with the first record
            csvRecord = records.get(0);
            /* read */ String comment = csvRecord.getComment();
            System.out.println(comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.close();
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}