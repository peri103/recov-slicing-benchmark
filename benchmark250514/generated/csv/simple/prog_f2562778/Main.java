import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data
        String csvData = "header1,header2\nvalue1,value2\n,,\nvalue3,value4";

        // Create CSVFormat with ignoreEmptyLines set to true
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Iterate over the records
            for (CSVRecord record : parser) {
                // Check if the first column is set
                /* read */ boolean isSet = record.isSet(0);

                // Print the result
                System.out.println("Is first column set: " + isSet);

                // Break after the first iteration to ensure read is executed only once
                break;
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}