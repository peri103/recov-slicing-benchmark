import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class CSVHandler {
    private CSVFormat format;
    private CSVParser parser;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void initializeParser(String csvContent) {
        try {
            parser = CSVParser.parse(new StringReader(csvContent), format);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addHeaderComment(String comment) {
        /* write */ format = format.withHeaderComments(comment);
    }

    public String getFirstComment() {
        if (parser != null) {
            for (CSVRecord record : parser) {
                /* read */ return record.getComment();
            }
        }
        return null;
    }
}
