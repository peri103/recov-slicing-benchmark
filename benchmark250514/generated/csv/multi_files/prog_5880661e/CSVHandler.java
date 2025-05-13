import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;

public class CSVHandler {
    private CSVFormat format;
    private String csvContent;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void initializeFormat() {
        /* write */ format = format.withCommentMarker('#');
    }

    public void generateCSVContent() throws Exception {
        StringWriter writer = new StringWriter();
        try (CSVPrinter printer = new CSVPrinter(writer, format)) {
            printer.printComment("This is a comment");
            printer.printRecord("value1", "value2");
        }
        csvContent = writer.toString();
    }

    public ArrayList<String> getComments() throws Exception {
        ArrayList<String> comments = new ArrayList<>();
        try (CSVParser parser = CSVParser.parse(new StringReader(csvContent), format)) {
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    comments.add(comment);
                }
            }
        }
        return comments;
    }
}