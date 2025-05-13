import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVDataProcessor {
    private String csvData;
    private CSVFormat csvFormat;

    public CSVDataProcessor(String csvData, CSVFormat csvFormat) {
        this.csvData = csvData;
        this.csvFormat = csvFormat;
    }

    public void processData() {
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            for (CSVRecord record : records) {
                for (String value : record) {
                    System.out.println("Value: " + value);
                }

                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }

                int sum = 0;
                for (int i = 0; i < record.size(); i++) {
                    sum += record.get(i).length();
                }
                System.out.println("Sum of lengths: " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
