import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class CSVRecordAnalyzer {
    private List<CSVRecord> records;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> ages = new ArrayList<>();

    public CSVRecordAnalyzer(List<CSVRecord> records) {
        this.records = records;
    }

    public void analyzeRecords() {
        for (CSVRecord record : records) {
            if (record.isConsistent()) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
            }
        }
    }

    public void printNames() {
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }

    public double calculateAverageAge() {
        int totalAge = 0;
        for (int age : ages) {
            totalAge += age;
        }
        return ages.size() > 0 ? (double) totalAge / ages.size() : 0.0;
    }

    public boolean isFirstRecordConsistent() {
        /* read */ return records.get(0).isConsistent();
    }
}
