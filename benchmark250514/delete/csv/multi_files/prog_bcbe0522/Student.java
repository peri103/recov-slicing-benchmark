import java.util.List;

public class Student {
    private String name;
    private int age;
    private String location;

    public Student(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
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

    public static List<Student> parseStudents(CSVParser parser) throws IOException {
        List<Student> students = new ArrayList<>();
        for (CSVRecord record : parser) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            String location = record.get("Location");
            students.add(new Student(name, age, location));
        }
        return students;
    }
}
