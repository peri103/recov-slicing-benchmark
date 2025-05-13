import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class CSVReader {
    private StringReader reader;
    private CSVParser parser;

    public CSVReader(String csvData) throws IOException {
        this.reader = new StringReader(csvData);
        this.parser = new CSVParser(reader, CSVFormat.DEFAULT);
    }

    public String readData() throws IOException {
        CSVRecord record = parser.getRecords().get(0);
        /* read */ return record.get(0);
    }

    public void close() throws IOException {
        parser.close();
        reader.close();
    }
}
