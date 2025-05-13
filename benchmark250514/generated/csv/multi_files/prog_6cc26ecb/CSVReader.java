import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class CSVReader {
    private String data;

    public CSVReader(String data) {
        this.data = data;
    }

    public String readComment() {
        String comment = null;
        try {
            StringReader reader = new StringReader(data);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            for (CSVRecord record : records) {
                /* read */ comment = record.getComment();
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return comment;
    }
}
