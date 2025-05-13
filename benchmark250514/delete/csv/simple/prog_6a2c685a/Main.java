import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withHeaderComments("This is a header comment");

        // Simulate a CSV record with the comment set by the write operation
        CSVRecord csvRecord = new CSVRecord(null, null, null, null, null, null, null, csvFormat);

        /* read */ String comment = csvRecord.getComment();
        System.out.println(comment);
    }
}