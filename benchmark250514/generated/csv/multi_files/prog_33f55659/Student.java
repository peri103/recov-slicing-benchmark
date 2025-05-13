import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private HashMap<String, Integer> nameAgeMap = new HashMap<>();

    public Student(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            nameAgeMap.put(name, age);
        }
    }

    public boolean isNameSet(CSVRecord record) {
        /* read */ return record.isSet("Name");
    }

    public HashMap<String, Integer> getNameAgeMap() {
        return nameAgeMap;
    }
}