import org.apache.commons.csv.CSVRecord;

import java.util.List;

public class RecordProcessor {
    private List<CSVRecord> records;

    public RecordProcessor(List<CSVRecord> records) {
        this.records = records;
    }

    public void printRecords() {
        for (CSVRecord record : records) {
            String name = record.get("Name");
            String age = record.get("Age");
            String location = record.get("Location");
            System.out.println("Name: " + name + ", Age: " + age + ", Location: " + location);
        }
    }

    public double calculateAverageAge() {
        int totalAge = 0;
        for (CSVRecord record : records) {
            totalAge += Integer.parseInt(record.get("Age"));
        }
        return totalAge / (double) records.size();
    }

    public boolean isNameMappedInFirstRecord() {
        CSVRecord firstRecord = records.get(0);
        // Read operation: check if the record is mapped for 'name'
        /* read */ return firstRecord.isMapped("name");
    }
}
