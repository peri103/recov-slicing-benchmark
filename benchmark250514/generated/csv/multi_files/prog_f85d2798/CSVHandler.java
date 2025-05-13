import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class CSVHandler {
    private StringWriter writer = new StringWriter();
    private CSVPrinter printer;
    private List<CSVRecord> recordList = new ArrayList<>();

    public CSVHandler() throws IOException {
        this.printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }

    public void addRecord(String firstName, String lastName, String email) throws IOException {
        /* write */ printer.printRecord(firstName, lastName, email);
        printer.flush();
        CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
        recordList.clear();
        recordList.addAll(parser.getRecords());
    }

    public List<CSVRecord> getRecords() {
        return recordList;
    }
}
