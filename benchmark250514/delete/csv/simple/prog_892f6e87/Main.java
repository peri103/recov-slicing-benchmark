import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a header comment");

        // Simulate reading the comment from a CSVRecord
        // Normally, we'd parse a CSV file to get a CSVRecord, but since file operations are not allowed,
        // we'll simulate this by creating a CSVRecord manually with the expected comment.
        CSVRecord record = new CSVRecord(null, null, null, 0, format);
        /* read */ String comment = record.getComment();
        
        // Print the comment
        System.out.println(comment);
    }
}