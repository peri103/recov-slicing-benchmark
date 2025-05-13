import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nDoe,25";

            // Parse CSV data
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Create list of Person objects
            List<Person> people = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                people.add(new Person(name, age));
            }

            // Perform operations on the list of Person objects
            for (Person person : people) {
                System.out.println(person.getName() + " is " + person.getAge() + " years old.");
            }

            // Use the read method to check if a field is set
            CSVRecord firstRecord = records.get(0);
            boolean isSet = firstRecord.isSet("name"); /* read */

            // Output the result
            System.out.println("Is 'name' field set in the first record? " + isSet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}