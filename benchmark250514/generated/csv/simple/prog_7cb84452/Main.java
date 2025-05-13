import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\nDoe,25";
        Reader in = new StringReader(csvData);
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Apply the write method
        /* write */ format = format.withFirstRecordAsHeader();
        
        try {
            CSVParser parser = new CSVParser(in, format);
            for (CSVRecord record : parser) {
                // Apply the read method
                /* read */ boolean isMapped = record.isMapped("name");
                System.out.println("Is 'name' mapped: " + isMapped);
                break; // Ensure the read method is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}