import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class StudentProcessor {
    private List<Student> students;

    public StudentProcessor(List<CSVRecord> records) {
        this.students = new ArrayList<>();
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            String location = record.get("Location");
            students.add(new Student(name, age, location));
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean isNameMapped(CSVRecord record) {
        /* read */ return record.isMapped("Name");
    }
}
