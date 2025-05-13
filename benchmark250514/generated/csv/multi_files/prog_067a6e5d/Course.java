import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private CSVFormat format;
    private List<CSVRecord> records;

    public Course(String courseName, String csvData) {
        this.courseName = courseName;
        this.records = new ArrayList<>();
        this.format = CSVFormat.DEFAULT;
        /* write */ this.format = this.format.withIgnoreHeaderCase();

        try {
            this.records = this.format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public String getCourseName() {
        return courseName;
    }
}
