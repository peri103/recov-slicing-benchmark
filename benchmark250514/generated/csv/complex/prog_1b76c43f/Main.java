import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');
        
        // Sample CSV data
        String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";
        
        // Parse CSV data using the format with the specified delimiter
        List<CSVRecord> records = null;
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Additional unrelated code to increase complexity
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();

        // Process each record and populate the lists
        if (records != null) {
            for (CSVRecord record : records) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
                cities.add(record.get(2));
            }
        }
        
        // Perform some operations on the lists
        int totalAge = 0;
        for (int age : ages) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) ages.size();
        System.out.println("Average Age: " + averageAge);

        // Read the first record and convert it to String
        if (records != null && !records.isEmpty()) {
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
        }

        // More operations
        for (String city : cities) {
            System.out.println("City: " + city);
        }
        
        // Additional logic to demonstrate complexity
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i) + ", City: " + cities.get(i));
        }
    }
}