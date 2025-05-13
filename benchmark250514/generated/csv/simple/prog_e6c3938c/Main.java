import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

        /* write */ csvPrinter.printComment("This is a comment");

        csvPrinter.flush();
        String csvData = writer.toString();
        List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();

        /* read */ String comment = records.get(0).getComment();
        System.out.println(comment);
    }
}