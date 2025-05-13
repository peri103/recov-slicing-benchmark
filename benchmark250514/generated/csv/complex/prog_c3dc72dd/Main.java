import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Prepare a sample CSV input
            String csvData = "Name,Age,Location\nJohn,25,NULL\nDoe,30,USA";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));
            Iterator<CSVRecord> iterator = records.iterator();

            // Additional code to make the program more complex
            List<String> namesList = new ArrayList<>();
            List<Integer> agesList = new ArrayList<>();

            while (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                namesList.add(record.get("Name"));
                agesList.add(Integer.parseInt(record.get("Age")));
            }

            // Perform operations on the lists
            for (String name : namesList) {
                System.out.println("Name: " + name);
            }

            int totalAge = 0;
            for (Integer age : agesList) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Re-parse the CSV data for the original read method
            iterator = format.parse(new StringReader(csvData)).iterator();

            // Read the first record
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                /* read */ boolean isSet = record.isSet("Location");
                System.out.println("Is 'Location' set: " + isSet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}