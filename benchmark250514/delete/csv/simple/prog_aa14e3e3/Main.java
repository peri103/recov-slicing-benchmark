import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT
                .withHeaderComments("This is a comment");

        // Simulate a CSVRecord with comment
        List<String> recordValues = Arrays.asList("value1", "value2");
        CSVRecord record = new CSVRecord(null, recordValues, null, 0, "This is a comment");

        /* write */ format = format.withHeaderComments("This is a comment");

        /* read */ String comment = record.getComment();
        
        System.out.println(comment);
    }
}