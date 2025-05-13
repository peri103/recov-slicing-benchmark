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
            // Initialize CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');

            // Sample CSV data
            String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"\n\"Jane Doe\",\"25\"";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional processing: Extract ages and calculate average
            ArrayList<Integer> ages = new ArrayList<>();
            for (CSVRecord record : records) {
                String ageString = record.get(1);
                int age = Integer.parseInt(ageString.replace("\"", ""));
                ages.add(age);
            }

            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            double averageAge = (double) sum / ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record and convert it to string
            CSVRecord firstRecord = records.get(0);
            String name = firstRecord.get(0);
            System.out.println("First Name: " + name);

            /* read */ String recordString = firstRecord.toString();
            System.out.println("First Record String: " + recordString);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}