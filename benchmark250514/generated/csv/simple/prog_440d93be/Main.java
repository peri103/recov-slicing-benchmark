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
        
        try (CSVPrinter printer = new CSVPrinter(writer, format)) {
            /* write */ printer.printComment("This is a comment");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String csvData = writer.toString();
        System.out.println("CSV Data:");
        System.out.println(csvData);

        try (CSVParser parser = CSVParser.parse(new StringReader(csvData), format)) {
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Read Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}