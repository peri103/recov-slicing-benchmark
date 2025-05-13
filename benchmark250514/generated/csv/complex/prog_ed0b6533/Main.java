import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Prepare sample CSV data
            String csvData = "# This is a header comment\n" +
                             "name,age\n" +
                             "John,30\n" +
                             "Jane,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("name"));
            }
            System.out.println("Names from CSV:");
            for (String name : names) {
                System.out.println(name);
            }

            // Perform some calculations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("age"));
            }
            System.out.println("Total age: " + totalAge);

            // Manipulate the list of names
            names.add("Alice");
            names.remove("John");
            System.out.println("Modified names:");
            for (String name : names) {
                System.out.println(name);
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}