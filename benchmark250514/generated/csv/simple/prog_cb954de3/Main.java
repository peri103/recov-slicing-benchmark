import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
        CSVFormat format = CSVFormat.DEFAULT;

        // Prepare the CSVFormat with the first record as header
        /* write */ CSVFormat csvFormatWithHeader = format.withFirstRecordAsHeader();

        try {
            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = csvFormatWithHeader.parse(reader);
            Iterator<CSVRecord> iterator = records.iterator();
            
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                // Check if a particular header is mapped
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}