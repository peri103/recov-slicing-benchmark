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
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            /* write */ printer.printComment("This is a comment");
            printer.flush();
            
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();
            String comment = null;
            for (CSVRecord record : records) {
                /* read */ comment = record.getComment();
                break; // Ensure the read method is executed only once
            }
            
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}