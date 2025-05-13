import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\n\nJane,25";
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);

        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Record isSet for 'name': " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}