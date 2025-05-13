import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class CSVHandler {
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;
    private CSVParser csvParser;

    public CSVHandler() {
        try {
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeComment(String comment) {
        try {
            /* write */ csvPrinter.printComment(comment);
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readComment() {
        try {
            csvParser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            List<CSVRecord> records = csvParser.getRecords();
            for (CSVRecord record : records) {
                if (record.getComment() != null) {
                    /* read */ return record.getComment();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvParser != null) {
                    csvParser.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void close() {
        try {
            if (csvPrinter != null) {
                csvPrinter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
