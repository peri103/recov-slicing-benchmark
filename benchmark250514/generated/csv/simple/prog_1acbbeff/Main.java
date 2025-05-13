import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,25,USA\nJane,30,UK";
        CSVFormat format = CSVFormat.DEFAULT;

        try {
            /* write */ format = format.withFirstRecordAsHeader();

            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
                break; // Ensure the read method is executed only once
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}