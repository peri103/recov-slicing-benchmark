import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            CSVHandler csvHandler = new CSVHandler(csvData);
            DataProcessor dataProcessor = new DataProcessor();
            
            List<CSVRecord> records = csvHandler.getRecords();
            dataProcessor.processRecords(records);
            dataProcessor.printDataMap();
            
            /* read */ String comment = records.get(0).getComment();
            if (comment != null) {
                System.out.println("Comment: " + comment);
            } else {
                System.out.println("No comment found.");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}