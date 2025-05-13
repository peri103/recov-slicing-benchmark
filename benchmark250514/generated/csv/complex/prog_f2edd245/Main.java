import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare to write to a StringWriter
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT;

            // Initialize CSVPrinter
            CSVPrinter csvPrinter = new CSVPrinter(writer, format);

            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();

            // Additional complex logic
            StringWriter writer2 = new StringWriter();
            CSVPrinter csvPrinter2 = new CSVPrinter(writer2, format);
            csvPrinter2.printRecord("John", "Doe", 30, "Engineer");
            csvPrinter2.printRecord("Jane", "Smith", 25, "Designer");
            csvPrinter2.flush();
            csvPrinter2.close();

            List<CSVRecord> records2 = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer2.toString())).getRecords();
            for (CSVRecord record : records2) {
                System.out.println("Name: " + record.get(0) + " " + record.get(1));
                System.out.println("Age: " + record.get(2));
                System.out.println("Profession: " + record.get(3));
            }

            // Some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read the comment using CSVRecord
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}