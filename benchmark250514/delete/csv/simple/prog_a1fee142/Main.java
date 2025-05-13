import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Simulate reading from a CSVRecord (normally obtained from parsing a CSV file)
        List<CSVRecord> records = new ArrayList<>();
        CSVRecord record = new CSVRecord(null, null, 0, 0) {
            @Override
            public String getComment() {
                return "This is a comment";
            }
        };
        records.add(record);

        // Read the comment from the CSVRecord
        /* read */ String comment = records.get(0).getComment();
        System.out.println(comment);
    }
}