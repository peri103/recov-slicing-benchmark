import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

            // Additional CSV format with different configurations
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withDelimiter(';').withQuote('"');

            // Simulate reading a CSV record
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);

            // Unrelated complex logic
            String csvData2 = "headerA;headerB\nvalueA1;valueB1\nvalueA2;valueB2";
            CSVParser parser = anotherFormat.parse(new StringReader(csvData2));
            for (CSVRecord rec : parser) {
                System.out.println("Record: " + rec.get(0) + ", " + rec.get(1));
            }

            // Additional CSV parsing logic
            CSVFormat yetAnotherFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines();
            String csvData3 = "\nheaderX,headerY\nvalueX1,valueY1\n\nvalueX2,valueY2";
            List<CSVRecord> records3 = yetAnotherFormat.parse(new StringReader(csvData3)).getRecords();
            for (CSVRecord rec : records3) {
                System.out.println("Record: " + rec.get(0) + ", " + rec.get(1));
            }

            // Read the comment from the CSV record
            /* read */ String comment = record.getComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}