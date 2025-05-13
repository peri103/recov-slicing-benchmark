import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data with multiple lines and comments
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2\nvalue3,value4";

            // Configure CSV format with header comments
            CSVConfiguration config = new CSVConfiguration();
            config.configureHeaderComments("This is a comment");

            // Process the CSV data
            CSVDataProcessor processor = new CSVDataProcessor(config);
            processor.parseData(csvData);

            // Retrieve and print records
            List<CSVRecord> records = processor.getRecords();
            for (CSVRecord record : records) {
                System.out.println("Record: " + record.get(0) + ", " + record.get(1));
            }

            // Retrieve the comment from the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ String comment = firstRecord.getComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}