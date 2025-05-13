import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSV format with header comments
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");
        
        // Simulate a CSV record that would have been parsed using the format
        List<String> data = Arrays.asList("value1", "value2");
        CSVRecord record = new CSVRecord(data, null, 0, 0, format);
        
        // Read the comment from the record
        /* read */ String comment = record.getComment();
        
        // Output the comment
        System.out.println(comment);
    }
}