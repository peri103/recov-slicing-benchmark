import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";
        CSVFormat format = CSVFormat.DEFAULT;

        // Initialize CSVParser
        CSVParser parser = null;
        try {
            format = /* write */ format.withFirstRecordAsHeader();
            parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record to check if a particular column is mapped
            CSVRecord record = parser.getRecords().get(0);
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' column mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (parser != null) {
                try {
                    parser.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}