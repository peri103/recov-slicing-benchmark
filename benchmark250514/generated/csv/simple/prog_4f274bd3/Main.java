import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.Reader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

        /* write */ csvPrinter.printRecord("value1", "value2", "value3");
        csvPrinter.flush();

        Reader inputReader = new StringReader(writer.toString());
        CSVParser parser = CSVParser.parse(inputReader, CSVFormat.DEFAULT);

        for (CSVRecord csvRecord : parser) {
            /* read */ String value = csvRecord.get(0);
            System.out.println(value);
            break; // Ensure the read operation is executed only once
        }
    }
}