import java.util.HashMap;
import org.apache.commons.csv.CSVRecord;

public class Student {
    private String name;
    private int age;
    private String location;

    public Student(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public static HashMap<String, Student> createStudents(List<CSVRecord> records) {
        HashMap<String, Student> students = new HashMap<>();
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            String location = record.get("Location");
            students.put(name, new Student(name, age, location));
        }
        return students;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}
