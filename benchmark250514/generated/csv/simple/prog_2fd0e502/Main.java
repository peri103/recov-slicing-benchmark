import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        CSVPrinter csvPrinter = null;
        try {
            csvPrinter = new CSVPrinter(stringWriter, CSVFormat.DEFAULT);
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String csvData = stringWriter.toString();
        CSVParser parser;
        try {
            parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : parser) {
                /* read */ String value = csvRecord.get(0);
                System.out.println(value);
                break; // Ensure the read line is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}