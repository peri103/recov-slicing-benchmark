import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
        
        ArrayList<String> additionalComments = new ArrayList<>();
        additionalComments.add("Additional comment 1");
        additionalComments.add("Additional comment 2");

        for (String comment : additionalComments) {
            csvPrinter.printComment(comment);
        }

        /* write */ csvPrinter.printComment("This is a comment");

        csvPrinter.flush();
        String csvData = writer.toString();
        List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();

        ArrayList<String> extractedComments = new ArrayList<>();
        for (CSVRecord record : records) {
            String comment = record.getComment();
            if (comment != null) {
                extractedComments.add(comment);
            }
        }

        for (String extractedComment : extractedComments) {
            System.out.println("Extracted comment: " + extractedComment);
        }

        /* read */ String comment = records.get(0).getComment();
        System.out.println("Original comment: " + comment);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}