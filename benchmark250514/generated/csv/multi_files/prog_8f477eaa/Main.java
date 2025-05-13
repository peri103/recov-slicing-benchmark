import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVCommentHandler commentHandler = new CSVCommentHandler();
            String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";
            List<CSVRecord> records = commentHandler.parseCSV(csvData);

            CSVDataProcessor dataProcessor = new CSVDataProcessor();
            dataProcessor.addRecords(records);

            HashMap<String, String> recordMap = dataProcessor.processRecords();
            for (String key : recordMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + recordMap.get(key));
            }

            String comment = dataProcessor.getFirstRecordComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}