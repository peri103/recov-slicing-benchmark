import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string representation
            CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Prepare a CSV input with a null value
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Initialize an ArrayList to store ages
            ArrayList<Integer> ages = new ArrayList<>();

            // Iterate over records and process each
            for (CSVRecord rec : records) {
                String ageStr = rec.get("age");
                if (ageStr == null || ageStr.equals("NULL")) {
                    ages.add(null);
                } else {
                    ages.add(Integer.parseInt(ageStr));
                }
            }

            // Perform some operations on the ages list
            int sum = 0;
            for (Integer age : ages) {
                if (age != null) {
                    sum += age;
                }
            }
            System.out.println("Sum of ages: " + sum);

            // Check if the 'age' field is set
            /* read */ boolean isSet = record.isSet("age");

            // Print the result
            System.out.println("Is 'age' field set in the first record? " + isSet);

            // Sort the ages list
            ages.sort((a, b) -> {
                if (a == null) return 1;
                if (b == null) return -1;
                return a.compareTo(b);
            });

            // Print sorted ages
            System.out.println("Sorted ages:");
            for (Integer age : ages) {
                System.out.println(age);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}