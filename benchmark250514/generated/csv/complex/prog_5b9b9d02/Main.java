import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

        // Sample CSV data
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

        // Unrelated code to add complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Assume we have at least one record
        List<CSVRecord> records = parser.getRecords();
        CSVRecord record = records.get(0);

        // More unrelated code
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ String comment = record.getComment(); // This should read the header comment

        // Further unrelated code
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        StringBuilder builder = new StringBuilder();
        for (String str : strings) {
            builder.append(str).append(" ");
        }
        System.out.println("Concatenated string: " + builder.toString());

        System.out.println(comment);
    }
}