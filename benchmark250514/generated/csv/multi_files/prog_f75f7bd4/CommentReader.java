import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class CommentReader {
    private String csvOutput;

    public CommentReader(String csvOutput) {
        this.csvOutput = csvOutput;
    }

    public String readComment() {
        try {
            CSVRecord record = CSVFormat.DEFAULT.parse(new StringReader(csvOutput)).iterator().next();
            /* read */ return record.getComment();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
