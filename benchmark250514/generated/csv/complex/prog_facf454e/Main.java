import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Step 2: Prepare a CSV string with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30";

            // Step 3: Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional unrelated code to increase complexity
            String[] headers = {"name", "age"};
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withHeader(headers);
            String anotherCsvData = "name,age\nAlice,25\nBob,35";
            List<CSVRecord> anotherRecords = anotherFormat.parse(new StringReader(anotherCsvData)).getRecords();

            for (CSVRecord record : anotherRecords) {
                System.out.println("Name: " + record.get("name") + ", Age: " + record.get("age"));
            }

            StringBuilder builder = new StringBuilder();
            builder.append("Processed ").append(anotherRecords.size()).append(" records.\n");
            System.out.println(builder.toString());

            // Step 4: Access the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Step 5: Print the comment
            System.out.println("Comment from the original CSV: " + comment);

            // Additional unrelated operations
            for (int i = 0; i < 3; i++) {
                System.out.println("Processing record " + (i + 1));
            }
            System.out.println("All records processed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}