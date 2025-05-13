import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data to parse
            String csvData = "name,age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Initialize an ArrayList to store ages
            ArrayList<Integer> ages = new ArrayList<>();

            // Iterate over records and store ages
            for (CSVRecord record : records) {
                String ageString = record.get("age").trim();
                int age = Integer.parseInt(ageString);
                ages.add(age);
            }

            // Perform some operations on the ages list
            int sumOfAges = 0;
            for (int age : ages) {
                sumOfAges += age;
            }
            double averageAge = sumOfAges / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record and check if a column is set using the read method
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("name");

            // Output the result
            System.out.println("Is 'name' set: " + isNameSet);

            // Additional logic to manipulate data
            for (int i = 0; i < ages.size(); i++) {
                if (ages.get(i) > 28) {
                    System.out.println("Age greater than 28: " + ages.get(i));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}