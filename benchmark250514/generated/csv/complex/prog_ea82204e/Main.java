import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a CSVParser to parse a sample CSV input
        String csvData = "Name,Age\nJohn,30\nDoe,25";
        List<CSVRecord> records = null;
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional code to make the program more complex
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        if (records != null) {
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
                ages.add(Integer.parseInt(record.get("Age")));
            }
        }

        // Manipulate data in names and ages lists
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
        }

        // Use the read method on the first CSVRecord
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);
        }

        // Further manipulation to make the program more complex
        int totalAge = 0;
        for (int age : ages) {
            totalAge += age;
        }
        double averageAge = (double) totalAge / ages.size();
        System.out.println("Average Age: " + averageAge);
    }
}