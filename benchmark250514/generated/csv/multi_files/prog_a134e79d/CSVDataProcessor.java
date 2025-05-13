import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVDataProcessor {
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<String, Integer> ageMap = new HashMap<>();

    public void processRecord(CSVRecord record) {
        String name = record.get(0);
        int age = Integer.parseInt(record.get(1).trim());
        names.add(name);
        ageMap.put(name, age);
    }

    public void printData() {
        for (String name : names) {
            System.out.println("Processing: " + name);
            Integer age = ageMap.get(name);
            if (age != null) {
                System.out.println(name + " is " + age + " years old.");
            }
        }
    }

    public int getTotalAge() {
        int totalAge = 0;
        for (Integer age : ageMap.values()) {
            totalAge += age;
        }
        return totalAge;
    }
}
