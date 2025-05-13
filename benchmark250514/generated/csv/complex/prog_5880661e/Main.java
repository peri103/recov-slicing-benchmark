import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize the CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Create a CSV string with a comment
        StringWriter writer = new StringWriter();
        try (CSVPrinter printer = new CSVPrinter(writer, format)) {
            printer.printComment("This is a comment");
            printer.printRecord("value1", "value2");
        }

        // Parse the CSV string
        String csvContent = writer.toString();
        try (CSVParser parser = CSVParser.parse(new StringReader(csvContent), format)) {
            ArrayList<String> comments = new ArrayList<>();
            ArrayList<ArrayList<String>> records = new ArrayList<>();
            HashMap<String, Integer> recordSummary = new HashMap<>();

            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    comments.add(comment);
                }

                ArrayList<String> recordValues = new ArrayList<>();
                for (String value : record) {
                    recordValues.add(value);
                    recordSummary.put(value, recordSummary.getOrDefault(value, 0) + 1);
                }
                records.add(recordValues);
            }

            // Print the comments
            System.out.println("Comments:");
            for (String comment : comments) {
                System.out.println(comment);
            }

            // Print the records
            System.out.println("Records:");
            for (ArrayList<String> record : records) {
                System.out.println(record);
            }

            // Print the record summary
            System.out.println("Record Summary:");
            for (String key : recordSummary.keySet()) {
                System.out.println(key + ": " + recordSummary.get(key));
            }
        }

        // Additional complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * i);
        }

        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("Alice", "Admin");
        userMap.put("Bob", "Editor");
        userMap.put("Charlie", "Viewer");

        System.out.println("User Roles:");
        for (String user : userMap.keySet()) {
            System.out.println(user + ": " + userMap.get(user));
        }
    }
}