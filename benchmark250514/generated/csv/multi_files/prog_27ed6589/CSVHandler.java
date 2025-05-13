import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void addHeaderComment(String comment) {
        /* write */ format = format.withHeaderComments(comment);
    }

    public String parseCSV(String csvData) {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ return record.getComment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}