import java.util.HashMap;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Student {
    private HashMap<String, Integer> ageMap = new HashMap<>();

    public void processRecords(List<CSVRecord> records) {
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            int age = Integer.parseInt(rec.get("Age"));
            ageMap.put(name, age);
        }
    }

    public void printAges() {
        for (String name : ageMap.keySet()) {
            int age = ageMap.get(name);
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
