import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.HashMap;

public class CSVRecordProcessor {
    private List<CSVRecord> records;
    private HashMap<String, Integer> nameAgeMap = new HashMap<>();

    public CSVRecordProcessor(List<CSVRecord> records) {
        this.records = records;
        processRecords();
    }

    private void processRecords() {
        for (CSVRecord record : records) {
            String name = record.get(0);
            int age = Integer.parseInt(record.get(1));
            nameAgeMap.put(name, age);
        }
    }

    public void printNameAgeMap() {
        for (String name : nameAgeMap.keySet()) {
            System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
        }
    }

    public void incrementAge(String name, int increment) {
        if (nameAgeMap.containsKey(name)) {
            nameAgeMap.put(name, nameAgeMap.get(name) + increment);
        }
    }

    public void printUpdatedMap() {
        System.out.println("Updated map:");
        for (String name : nameAgeMap.keySet()) {
            System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
        }
    }

    public String getFirstRecordString() {
        /* read */ return records.get(0).toString();
    }
}
