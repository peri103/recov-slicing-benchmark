import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, String> studentInfo;

    public Student(String name, String age, String email) {
        this.name = name;
        studentInfo = new HashMap<>();
        studentInfo.put("Name", name);
        studentInfo.put("Age", age);
        studentInfo.put("Email", email);
    }

    public Map<String, String> getStudentInfo() {
        return studentInfo;
    }

    public void printInfo() {
        for (Map.Entry<String, String> entry : studentInfo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
