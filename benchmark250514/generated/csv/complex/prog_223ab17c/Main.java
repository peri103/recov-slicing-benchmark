import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        List<String> data = new ArrayList<>();
        data.add("Name");
        data.add("Age");
        data.add("Country");

        try {
            // Initialize CSVPrinter
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(data.toArray(new String[0])));

            // Write a comment
            /* write */ csvPrinter.printComment("This is a comment");

            // Add some records
            csvPrinter.printRecord("Alice", "30", "USA");
            csvPrinter.printRecord("Bob", "25", "UK");
            csvPrinter.printRecord("Charlie", "35", "Canada");

            // Make sure to flush the printer to write the data to the writer
            csvPrinter.flush();

            // Additional operations to make the program more complex
            List<CSVRecord> records;
            try (CSVParser parser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withFirstRecordAsHeader().withCommentMarker('#'))) {
                records = parser.getRecords();
            }

            // Process records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                String country = record.get("Country");
                System.out.printf("Name: %s, Age: %s, Country: %s%n", name, age, country);
            }

            // Read the comment using CSVParser
            CSVParser parser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            for (CSVRecord record : parser) {
                // Assuming the comment is associated with the record
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            csvPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}