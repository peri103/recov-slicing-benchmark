import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);
        
        // Simulating a CSVRecord for demonstration, normally obtained from parsing a CSV
        CSVRecord record = new CSVRecord(format, new String[]{"value"}, null, 0, 0);
        
        /* read */ boolean isConsistent = record.isConsistent();
        System.out.println(isConsistent);
    }
}