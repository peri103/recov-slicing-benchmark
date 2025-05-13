import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);
        
        // Since CSVRecord is typically obtained by parsing a CSV file, and we are not doing any file operations,
        // we will simulate a CSVRecord for demonstration purposes. Normally, this would be obtained from parsing.
        CSVRecord record = new CSVRecord(format, new String[]{"data"}, 0, 0);
        
        /* read */ boolean isConsistent = record.isConsistent();
        System.out.println(isConsistent);
    }
}