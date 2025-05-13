import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific null string
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\nJane,NULL";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a list to store names
            List<String> names = new ArrayList<>();

            // Retrieve the records and store names
            for (CSVRecord record : parser) {
                names.add(record.get("name"));
            }

            // Perform some operations on names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Check if a specific field is set for each record
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("age");
                System.out.println("Is 'age' set: " + isSet);
            }

            // Perform additional operations on CSV data
            for (CSVRecord record : parser) {
                String age = record.get("age");
                if ("NULL".equals(age)) {
                    System.out.println(record.get("name") + " has no age specified.");
                } else {
                    System.out.println(record.get("name") + " is " + age + " years old.");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}