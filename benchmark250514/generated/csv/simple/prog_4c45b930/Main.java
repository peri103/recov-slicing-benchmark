import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        
        try {
            // Initialize CSVPrinter with a format that allows comments
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));
            
            // Use the write method to print a comment
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();
            
            // Parse the written content to read it back
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
            
            // Iterate over the records to find the comment
            for (CSVRecord record : parser) {
                String comment = /* read */ record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}