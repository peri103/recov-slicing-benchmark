import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(reader).getRecords();

            // Additional unrelated operations to increase complexity
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                sumOfAges += age;
                System.out.println("Processed: " + name + ", Age: " + age);
            }
            System.out.println("Total Sum of Ages: " + sumOfAges);

            // Create another CSVFormat to demonstrate complexity
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withHeader("name", "age");
            String anotherCSVData = "Alice,28\nBob,22";
            StringReader anotherReader = new StringReader(anotherCSVData);
            List<CSVRecord> anotherRecords = anotherFormat.parse(anotherReader).getRecords();

            for (CSVRecord record : anotherRecords) {
                System.out.println("Another Record: " + record.get(0) + ", " + record.get(1));
            }

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Header Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}