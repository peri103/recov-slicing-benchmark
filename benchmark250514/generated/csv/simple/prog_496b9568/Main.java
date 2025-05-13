import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles";

            // Parse the CSV data using the configured format
            List<CSVRecord> records = new ArrayList<>();
            try (StringReader reader = new StringReader(csvData)) {
                records = format.parse(reader).getRecords();
            }

            // Read the consistency of the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}