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
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter with default CSV format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment to the CSV output
            /* write */ printer.printComment("This is a comment");

            // Add some additional unrelated CSV data
            printer.printRecord("Name", "Age", "Country");
            printer.printRecord("John Doe", 29, "USA");
            printer.printRecord("Jane Smith", 34, "Canada");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Simulate reading the CSV record from the written CSV output
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Create an ArrayList to store ages
            ArrayList<Integer> ages = new ArrayList<>();

            // Process the CSV records to extract ages
            for (CSVRecord record : records) {
                if (record.size() >= 2) {
                    try {
                        int age = Integer.parseInt(record.get(1));
                        ages.add(age);
                    } catch (NumberFormatException e) {
                        // Handle potential number format exception
                    }
                }
            }

            // Calculate the average age
            double averageAge = 0;
            for (int age : ages) {
                averageAge += age;
            }
            averageAge /= ages.size();

            // Print the average age
            System.out.println("Average Age: " + averageAge);

            // Assuming the comment is stored in a CSVRecord, read the comment
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}