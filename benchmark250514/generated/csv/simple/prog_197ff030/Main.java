import java.io.IOException;
import java.io.StringWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();
            csvPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String csvContent = writer.toString();
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), CSVFormat.DEFAULT);
            for (CSVRecord record : parser) {
                /* read */ String value = record.get(0);
                System.out.println(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}