import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
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

        // Additional data to be printed
        List<String> additionalData = Arrays.asList("extra1", "extra2", "extra3");
        
        /* write */ csvPrinter.printRecord("value1", "value2", "value3");
        csvPrinter.printRecord(additionalData);
        csvPrinter.flush();

        Reader inputReader = new StringReader(writer.toString());
        CSVParser parser = CSVParser.parse(inputReader, CSVFormat.DEFAULT);

        List<String> retrievedData = null;
        
        for (CSVRecord csvRecord : parser) {
            if (csvRecord.getRecordNumber() == 1) {
                /* read */ String value = csvRecord.get(0);
                System.out.println(value);
            } else {
                // Store additional data for further processing
                retrievedData = csvRecord.toList();
            }
        }

        // Further processing with the retrieved data
        if (retrievedData != null) {
            for (String data : retrievedData) {
                System.out.println("Processed: " + data);
            }
        }
    }
}