import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a comment to the CSV
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Additional complex logic
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * i);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of squares: " + sum);

            // More complex operations
            ArrayList<String> words = new ArrayList<>();
            words.add("apple");
            words.add("banana");
            words.add("cherry");

            StringBuilder concatenatedWords = new StringBuilder();
            for (String word : words) {
                concatenatedWords.append(word).append(" ");
            }
            System.out.println("Concatenated words: " + concatenatedWords.toString().trim());

            // Read the comment back from the CSV
            String csvContent = writer.toString();
            StringReader reader = new StringReader(csvContent);
            List<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader).getRecords();

            // Assuming the comment is associated with the first record
            // This is a simplification, as CSV does not directly store comments with records
            String comment = null;
            for (CSVRecord record : records) {
                comment = /* read */ record.getComment();
                if (comment != null) break;
            }

            System.out.println("Comment: " + comment);

            // Additional logic for processing numbers
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Max square: " + max);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}