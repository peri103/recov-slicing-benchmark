import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trim option
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrim();

        // Create a CSVRecord for testing
        String csvData = "name, age\nJohn Doe, 30";
        CSVRecord record = null;

        try {
            List<CSVRecord> records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .parse(new StringReader(csvData))
                    .getRecords();
            if (!records.isEmpty()) {
                record = records.get(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ensure the record is not null
        if (record != null) {
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);
        }
    }
}