import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Student {
    private String name;
    private int age;

    public Student(CSVRecord record) {
        /* read */ if (record.isMapped("Name")) {
            this.name = record.get("Name");
            this.age = Integer.parseInt(record.get("Age"));
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
