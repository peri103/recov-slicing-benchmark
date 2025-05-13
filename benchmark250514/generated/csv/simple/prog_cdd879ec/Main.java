import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        StringWriter out = new StringWriter();
        
        try {
            // Initialize CSVPrinter with a format that supports comments
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withCommentMarker('#'));
            
            /* write */ printer.printComment("This is a comment");
            printer.printRecord("header1", "header2");
            printer.printRecord("value1", "value2");
            printer.flush();
            
            // Read the CSV content
            String csvData = out.toString();
            StringReader reader = new StringReader(csvData);
            CSVParser parser = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}