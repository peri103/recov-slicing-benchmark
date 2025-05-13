import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles";
        CSVFormat format = CSVFormat.DEFAULT;

        // Write operation
        /* write */ format = format.withIgnoreEmptyLines();

        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Read operation
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set: " + isSet);
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}