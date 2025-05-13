import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        try {
            // Adding header comments
            /* write */ csvFormat = csvFormat.withHeaderComments("This is a comment");
            
            // Writing to CSV
            CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
            csvPrinter.printRecord("Header1", "Header2");
            csvPrinter.printRecord("Value1", "Value2");
            csvPrinter.close();
            
            // Reading from CSV
            Reader reader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(reader, csvFormat);
            List<CSVRecord> records = csvParser.getRecords();
            
            // Accessing the comment
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);
            
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}