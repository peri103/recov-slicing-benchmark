import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            CSVUtility csvUtility = new CSVUtility();
            csvUtility.configureFormat();

            String csvData = "name,age\nJohn Doe,30\nJane Smith,25";
            List<CSVRecord> records = csvUtility.parseCSV(csvData);

            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            ArrayList<Person> people = new ArrayList<>();

            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
                people.add(new Person(name, age));
            }

            String oldestPerson = null;
            int maxAge = 0;
            for (Person person : people) {
                if (person.getAge() > maxAge) {
                    maxAge = person.getAge();
                    oldestPerson = person.getName();
                }
            }

            System.out.println("Oldest person: " + oldestPerson + " with age " + maxAge);

            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}