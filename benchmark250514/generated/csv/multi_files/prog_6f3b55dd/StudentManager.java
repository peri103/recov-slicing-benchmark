import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private HashMap<String, Integer> ageMap = new HashMap<>();

    public void addStudent(String name, int age, String location) {
        students.add(new Student(name, age, location));
        ageMap.put(name, age);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void processCSVRecords(List<CSVRecord> records) {
        for (CSVRecord rec : records) {
            addStudent(rec.get("Name"), Integer.parseInt(rec.get("Age")), rec.get("Location"));
        }
    }

    public void printStudentDetails() {
        for (Student student : students) {
            System.out.println("Processing: " + student.getName());
            if (ageMap.containsKey(student.getName())) {
                System.out.println(student.getName() + " is " + ageMap.get(student.getName()) + " years old.");
            }
        }
    }
}
