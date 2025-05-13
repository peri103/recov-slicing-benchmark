import org.apache.commons.csv.CSVRecord;

public class RecordAnalyzer {

    public boolean isAgeSet(CSVRecord record) {
        /* read */ return record.isSet("age");
    }

    public String getCity(CSVRecord record) {
        String city = record.get("city");
        return city == null ? "Unknown" : city;
    }
}
