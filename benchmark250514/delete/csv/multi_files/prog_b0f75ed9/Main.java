import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            CommentExtractor commentExtractor = new CommentExtractor();

            // Prepare a sample CSV input with comments
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2";

            // Parse the CSV data
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Extract and print the comment
            String comment = commentExtractor.extractComment(records);
            System.out.println(comment);

            // Additional unrelated code to increase complexity
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numberList.add(i * 2);
            }

            int sum = 0;
            for (Integer num : numberList) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // More unrelated code
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            for (String str : stringList) {
                System.out.println(str.toUpperCase());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}