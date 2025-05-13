import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a header comment");

        // Simulate parsing a CSV file with the given format
        String csvData = "# This is a header comment\nHeader1,Header2\nValue1,Value2";
        try {
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0); // Get the first record

            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}