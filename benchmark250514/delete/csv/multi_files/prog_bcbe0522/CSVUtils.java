import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    public CSVParser parseCSV(String csvData) throws IOException {
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        return new CSVParser(new StringReader(csvData), format);
    }
}
