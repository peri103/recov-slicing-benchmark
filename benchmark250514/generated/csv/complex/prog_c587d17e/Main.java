import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "header1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            ArrayList<String> processedValues = new ArrayList<>();
            for (CSVRecord record : records) {
                StringBuilder sb = new StringBuilder();
                for (String value : record) {
                    sb.append(value.toUpperCase()).append("-");
                }
                processedValues.add(sb.toString());
            }

            // Processed values
            for (String processedValue : processedValues) {
                System.out.println("Processed Value: " + processedValue);
            }

            // Read the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }

            // Further operations on processed values
            ArrayList<String> filteredValues = new ArrayList<>();
            for (String processedValue : processedValues) {
                if (processedValue.contains("VALUE1")) {
                    filteredValues.add(processedValue);
                }
            }

            // Display filtered values
            for (String filteredValue : filteredValues) {
                System.out.println("Filtered Value: " + filteredValue);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}