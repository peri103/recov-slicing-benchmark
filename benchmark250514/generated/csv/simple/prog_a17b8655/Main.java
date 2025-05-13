import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the specified write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        String csvData = "header1,header2\nvalue1,value2";
        Reader in = new StringReader(csvData);
        Iterable<CSVRecord> records = null;
        
        try {
            records = format.parse(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator<CSVRecord> iterator = records.iterator();
        CSVRecord record = iterator.next();
        
        // Use the read method to check consistency
        /* read */ boolean isConsistent = record.isConsistent();
        
        System.out.println("Is the CSV record consistent? " + isConsistent);
    }
}