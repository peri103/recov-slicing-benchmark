import org.apache.commons.csv.CSVRecord;

import java.util.ArrayList;
import java.util.List;

public class StudentProcessor {
    private List<Student> students = new ArrayList<>();

    public void processRecords(List<CSVRecord> records) {
        for (CSVRecord record : records) {
            String name = record.get("name");
            int age = Integer.parseInt(record.get("age"));
            students.add(new Student(name, age));
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
