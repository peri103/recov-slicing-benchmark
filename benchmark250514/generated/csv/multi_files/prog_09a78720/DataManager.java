import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class DataManager {
    private List<CSVRecord> records;

    public DataManager(List<CSVRecord> records) {
        this.records = records;
    }

    public List<String> getFirstColumnValues() {
        ArrayList<String> valuesList = new ArrayList<>();
        for (CSVRecord rec : records) {
            valuesList.add(rec.get(0)); // Assuming the first column is of interest
        }
        return valuesList;
    }

    public String getCommentFromRecord(int index) {
        if (index < records.size()) {
            /* read */ return records.get(index).getComment();
        }
        return null;
    }
}
