import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Simulating CSV data with a comment
        String csvData = "# This is a comment\nName,Age\nJohn,30";

        try {
            // Initialize CSVFormat with comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();

            for (CSVRecord record : records) {
                if (!record.hasComment()) {
                    names.add(record.get(0));
                    ages.add(Integer.parseInt(record.get(1)));
                }
            }

            // Perform some operations on the extracted data
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = ages.size() > 0 ? (double) totalAge / ages.size() : 0;

            System.out.println("Names: " + names);
            System.out.println("Total Age: " + totalAge);
            System.out.println("Average Age: " + averageAge);

            // Retrieve the comment
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment); // Output the comment

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        int sumOfSquares = 0;
        for (int num : numbers) {
            sumOfSquares += num;
        }

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}