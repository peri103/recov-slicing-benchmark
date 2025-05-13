import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "Name, Age\nJohn, 30\nJane, 25";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped in the record? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}