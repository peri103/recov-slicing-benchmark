import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class RecordReader {
    private CSVParser parser;

    public RecordReader(CSVParser parser) {
        this.parser = parser;
    }

    public String readComment() throws IOException {
        // Get the first record
        CSVRecord record = parser.getRecords().get(0);
        // Read the comment from the record
        /* read */ return record.getComment();
    }
}
