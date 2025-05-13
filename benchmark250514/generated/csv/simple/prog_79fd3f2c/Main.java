import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age,city\nJohn,25,New York\nJane,30,Los Angeles";
        CSVFormat format = CSVFormat.DEFAULT;

        try {
            /* write */ format = format.withFirstRecordAsHeader();
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}