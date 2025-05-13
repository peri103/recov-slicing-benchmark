import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVProcessor {
    private CSVUtil csvUtil;

    public CSVProcessor(CSVUtil csvUtil) {
        this.csvUtil = csvUtil;
    }

    public void processCSVData(String csvData) {
        try {
            List<CSVRecord> records = csvUtil.getFormat().parse(new StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();
            System.out.println("Comment from CSVRecord: " + comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
