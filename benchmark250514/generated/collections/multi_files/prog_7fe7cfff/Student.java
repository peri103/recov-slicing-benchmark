import org.apache.commons.collections4.map.ListOrderedMap;

public class Student {
    private String name;
    private ListOrderedMap<String, Integer> grades = new ListOrderedMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String course, int grade) {
        /* write */ grades.put(course, grade);
    }

    public int getGrade(String course) {
        return grades.get(course);
    }

    public String getName() {
        return name;
    }
}
