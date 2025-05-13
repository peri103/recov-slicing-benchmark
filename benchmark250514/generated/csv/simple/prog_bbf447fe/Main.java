import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Use CSVFormat to configure the comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Step 2: Prepare a CSV input string containing a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Step 3: Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Step 4: Iterate over the records and retrieve the comment
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}