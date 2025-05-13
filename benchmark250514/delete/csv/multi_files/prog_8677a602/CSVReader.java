import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class CSVReader {
    private CSVFormat csvFormat;

    public CSVReader(CSVFormat csvFormat) {
        this.csvFormat = csvFormat;
    }

    public String readComment(String csvContent) throws IOException {
        Reader reader = new StringReader(csvContent);
        CSVParser csvParser = new CSVParser(reader, csvFormat);
        List<CSVRecord> records = csvParser.getRecords();
        /* read */ String comment = records.get(0).getComment();
        csvParser.close();
        return comment;
    }
}
