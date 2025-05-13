import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code for complexity
            ArrayList<String> list = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();

            list.add("Hello");
            list.add("World");
            map.put("One", 1);
            map.put("Two", 2);

            for (String str : list) {
                System.out.println(str + " - Length: " + str.length());
            }

            int sum = 0;
            for (Integer value : map.values()) {
                sum += value;
            }
            System.out.println("Sum of values in map: " + sum);

            // Unrelated CSV parsing for additional complexity
            String csvData2 = "headerA,headerB\n" +
                              "dataA1,dataB1\n" +
                              "dataA2,dataB2";
            CSVParser parser2 = new CSVParser(new StringReader(csvData2), CSVFormat.DEFAULT);
            for (CSVRecord rec : parser2) {
                System.out.println("Record: " + rec.get(0) + ", " + rec.get(1));
            }
            parser2.close();

            // Read the comment from the first record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();
            System.out.println("Original Comment: " + comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}