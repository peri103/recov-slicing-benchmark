import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        // Simulating the writing process
        /* write */ format = format.withCommentMarker('#');

        // Create a mock CSVRecord with a comment using the format
        CSVRecord record = new CSVRecord(null, null, format);

        // Simulating the reading process
        /* read */ String comment = record.getComment();
        
        // Output the comment to verify the read value
        System.out.println(comment);
    }
}