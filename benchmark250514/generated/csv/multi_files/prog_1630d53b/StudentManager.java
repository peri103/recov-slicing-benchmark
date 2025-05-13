import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManager {
    private HashMap<String, Student> students = new HashMap<>();

    public void loadStudents(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            students.put(name, new Student(name, age));
        }
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public String getHeaderComment(CSVHandler csvHandler) {
        /* read */ return csvHandler.getRecords().get(0).getComment();
    }
}
