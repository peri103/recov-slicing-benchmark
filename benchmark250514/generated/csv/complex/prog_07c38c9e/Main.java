import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat and configure it to ignore empty lines
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nAlice,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Introduce additional complexity with unrelated operations
            List<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                if (rec.isSet("name")) {
                    names.add(rec.get("name"));
                }
            }

            // Perform some operations on the names list
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i));
            }

            // Introduce another CSV operation
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withDelimiter(';');
            String anotherCsvData = "product;price\nLaptop;1000\nPhone;500";
            CSVParser anotherParser = new CSVParser(new StringReader(anotherCsvData), anotherFormat);
            List<CSVRecord> anotherRecords = anotherParser.getRecords();
            for (CSVRecord anotherRecord : anotherRecords) {
                System.out.println("Product: " + anotherRecord.get("product") + ", Price: " + anotherRecord.get("price"));
            }

            // Read the first CSV record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set in the first record: " + isSet);

            parser.close();
            anotherParser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}