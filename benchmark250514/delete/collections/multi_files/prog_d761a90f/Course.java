import org.apache.commons.collections4.map.ListOrderedMap;

public class Course {
    private ListOrderedMap<String, Integer> grades = new ListOrderedMap<>();

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public Integer getGrade(String studentName) {
        return grades.get(studentName);
    }
}
