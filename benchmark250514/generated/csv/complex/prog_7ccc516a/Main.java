import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            /* write */ printer.printComment("This is a comment");
            printer.flush();

            // Adding complexity with ArrayList operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }

            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            String csvContent = writer.toString();
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvContent)).getRecords();

            // More complex operations on CSVRecord
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);

                // Additional operations on CSVRecord
                for (int i = 0; i < record.size(); i++) {
                    System.out.println("Record value at " + i + ": " + record.get(i));
                }

                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }

            // Further complexity with string manipulation
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < numbers.size(); i++) {
                builder.append(numbers.get(i)).append(" ");
            }
            System.out.println("Numbers in string format: " + builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}