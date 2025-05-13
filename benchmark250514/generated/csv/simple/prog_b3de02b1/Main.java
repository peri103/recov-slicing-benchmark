import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            /* write */ csvPrinter.printRecord("John", "Doe", "30");
            csvPrinter.flush();

            String csvContent = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            List<CSVRecord> records = parser.getRecords();

            CSVRecord record = records.get(0);
            /* read */ String firstName = record.get(0);

            System.out.println(firstName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}