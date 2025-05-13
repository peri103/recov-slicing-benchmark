import java.util.ArrayList;
import java.util.HashMap;

public class DataProcessor {
    private ArrayList<HashMap<String, String>> recordsList;

    public DataProcessor(ArrayList<HashMap<String, String>> recordsList) {
        this.recordsList = recordsList;
    }

    public void printRecords() {
        for (HashMap<String, String> record : recordsList) {
            for (String key : record.keySet()) {
                System.out.println(key + ": " + record.get(key));
            }
        }
    }

    public int calculateTotalAge() {
        int totalAge = 0;
        for (HashMap<String, String> rec : recordsList) {
            totalAge += Integer.parseInt(rec.get("Age"));
        }
        return totalAge;
    }
}
