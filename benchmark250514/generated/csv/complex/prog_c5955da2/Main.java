import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces();

            // Unrelated code to add complexity
            ArrayList<String> names = new ArrayList<>();
            names.add("John");
            names.add("Jane");
            names.add("Doe");

            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            String csvData = "name, age\nJohn, 30\nJane, 25\nDoe, 40";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // More unrelated code
            int sumOfAges = 0;
            for (CSVRecord rec : parser.getRecords()) {
                sumOfAges += Integer.parseInt(rec.get("age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set: " + isSet);

            // Further complexity with ArrayList
            ArrayList<Integer> ages = new ArrayList<>();
            ages.add(30);
            ages.add(25);
            ages.add(40);

            for (int age : ages) {
                System.out.println("Age: " + age);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}