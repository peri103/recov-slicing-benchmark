import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, String> details;

    public Student(String name) {
        this.name = name;
        this.details = new HashMap<>();
    }

    public void addDetail(String key, String value) {
        details.put(key, value);
    }

    public String getDetail(String key) {
        return details.get(key);
    }

    public String getName() {
        return name;
    }
}
