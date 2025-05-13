import java.util.HashMap;
import java.util.Map;

public class DataProcessor {
    private Map<String, String> dataMap = new HashMap<>();

    public void processRecord(CSVRecord record) {
        dataMap.put("Name", record.get("Name"));
        dataMap.put("Age", record.get("Age"));
        dataMap.put("Location", record.get("Location"));

        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public boolean isNameMapped(CSVRecord record) {
        /* read */ return record.isMapped("Name");
    }

    public String getEligibilityMessage() {
        int age = Integer.parseInt(dataMap.get("Age"));
        String location = dataMap.get("Location");

        if (age > 20 && location.equals("USA")) {
            return "Eligible for promotion.";
        } else {
            return "Not eligible for promotion.";
        }
    }
}
