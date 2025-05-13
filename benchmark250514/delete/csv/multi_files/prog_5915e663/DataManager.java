import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataManager {
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<String, Integer> ages = new HashMap<>();

    public void processRecords(List<CSVRecord> records) {
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            int age = Integer.parseInt(rec.get("Age"));
            names.add(name);
            ages.put(name, age);
        }
    }

    public void displayData() {
        for (String name : names) {
            System.out.println("Processing name: " + name);
        }

        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
