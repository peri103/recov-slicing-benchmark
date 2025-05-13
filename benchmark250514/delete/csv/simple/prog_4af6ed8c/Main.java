import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withHeaderComments("This is a comment");

        // Simulate a CSVRecord with comments
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, csvFormat);

        // Read the comment from the CSVRecord
        /* read */ String comment = record.getComment();
        System.out.println(comment);
    }
}