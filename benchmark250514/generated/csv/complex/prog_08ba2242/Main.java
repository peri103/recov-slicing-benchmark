import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare to write data
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write data
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();

            // Additional complex operations
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("extra1");
            dataList.add("extra2");
            dataList.add("extra3");

            for (String data : dataList) {
                csvPrinter.printRecord(data, data.length());
            }
            csvPrinter.flush();

            // Prepare to read data
            Reader inputReader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(inputReader, CSVFormat.DEFAULT);

            // Additional complex operations
            List<CSVRecord> records = csvParser.getRecords();
            for (CSVRecord rec : records) {
                System.out.println("Record: " + rec.toString());
            }

            // Read data
            CSVRecord record = records.get(0);
            /* read */ String value = record.get(0);

            // Output the read value
            System.out.println("Read Value: " + value);

            // Close resources
            csvPrinter.close();
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}