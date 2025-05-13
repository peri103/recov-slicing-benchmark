import java.util.HashMap;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Student {
    private String name;
    private String age;
    private String location;

    public Student(String name, String age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return age + ", " + location;
    }

    public static HashMap<String, Student> createStudentMap(List<CSVRecord> records) {
        HashMap<String, Student> studentMap = new HashMap<>();
        for (CSVRecord rec : records) {
            String name = rec.get(0);
            String age = rec.get(1);
            String location = rec.get(2);
            studentMap.put(name, new Student(name, age, location));
        }
        return studentMap;
    }
}
