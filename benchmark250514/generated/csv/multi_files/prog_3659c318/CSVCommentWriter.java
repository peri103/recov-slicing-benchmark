import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;

public class CSVCommentWriter {
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;

    public CSVCommentWriter() {
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

    public String getCSVData() {
        return writer.toString();
    }

    public void close() {
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
