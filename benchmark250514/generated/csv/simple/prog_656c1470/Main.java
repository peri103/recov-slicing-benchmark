import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name,age\nJohn,30\nJane,25";
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();

            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0); // Get the first record

            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}