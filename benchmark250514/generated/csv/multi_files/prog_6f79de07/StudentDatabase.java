import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDatabase {
    private Map<String, Student> students = new HashMap<>();

    public void loadStudents(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            String city = record.get("city");
            Student student = new Student(name, age, city);
            students.put(name, student);
        }
    }

    public Student getStudent(String name) {
        return students.get(name);
    }
}
