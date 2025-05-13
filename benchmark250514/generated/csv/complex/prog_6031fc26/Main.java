import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = null;
        CSVParser csvParser = null;

        try {
            // Initialize CSVPrinter
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));

            // Write a comment
            /* write */ csvPrinter.printComment("This is a comment");
            
            // Adding additional complexity with unrelated code
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(i * 2);
            }

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                map.put("Key" + i, list.get(i));
            }

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

            csvPrinter.flush();

            // Read back the comment
            csvParser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            List<CSVRecord> records = csvParser.getRecords();
            for (CSVRecord record : records) {
                if (record.getComment() != null) {
                    // Read the comment
                    /* read */ String comment = record.getComment();
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.close();
                }
                if (csvParser != null) {
                    csvParser.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}