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
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            /* write */ printer.printComment("This is a comment");
            printer.flush();
            
            String csvContent = writer.toString();
            StringReader reader = new StringReader(csvContent);
            CSVParser parser = new CSVParser(reader, format);

            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
            
            parser.close();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}