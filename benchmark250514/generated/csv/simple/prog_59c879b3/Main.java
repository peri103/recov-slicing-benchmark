import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a header comment");

            // Simulate CSV data
            String csvData = "# This is a header comment\nName,Age\nJohn,30\nDoe,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the first record
            String comment = /* read */ records.get(0).getComment();
            System.out.println(comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}