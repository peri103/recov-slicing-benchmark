import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize the CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Create a CSV string with a comment
        StringWriter writer = new StringWriter();
        try (CSVPrinter printer = new CSVPrinter(writer, format)) {
            printer.printComment("This is a comment");
            printer.printRecord("value1", "value2");
        }

        // Parse the CSV string
        String csvContent = writer.toString();
        try (CSVParser parser = CSVParser.parse(new StringReader(csvContent), format)) {
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
        }
    }
}