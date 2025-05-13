import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Create a mock CSVRecord for demonstration
        String[] data = {"Value1", "Value2"};
        String comment = "#This is a comment";
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(comment + "\nValue1,Value2")).iterator().next();

        /* read */ String extractedComment = record.getComment();
        System.out.println(extractedComment);
    }
}