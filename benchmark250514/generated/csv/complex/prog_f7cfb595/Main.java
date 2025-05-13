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
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a header comment");

            // Create a CSVPrinter to write the CSV data
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write some sample data
            printer.printRecord("Name", "Age", "Country");
            printer.printRecord("Alice", "30", "USA");
            printer.printRecord("Bob", "25", "UK");
            
            // Flush and close the printer
            printer.flush();
            printer.close();

            // Parse the written CSV data
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Unrelated complex code using ArrayList
            ArrayList<String> countries = new ArrayList<>();
            countries.add("USA");
            countries.add("UK");
            countries.add("Canada");

            for (String country : countries) {
                System.out.println("Processing country: " + country);
            }

            // Assume the comment is associated with the first record
            CSVRecord firstRecord = records.get(0);
            
            /* read */ String comment = firstRecord.getComment();
            System.out.println(comment);

            // More complex code using loops and conditions
            for (CSVRecord record : records) {
                if (record.size() > 2) {
                    System.out.println("Record with more than 2 fields: " + record);
                }
            }

            int sumOfAges = 0;
            for (CSVRecord record : records) {
                try {
                    sumOfAges += Integer.parseInt(record.get(1));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age format for record: " + record);
                }
            }
            System.out.println("Sum of ages: " + sumOfAges);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}