import com.google.common.collect.HashBiMap;

public class Course {
    private String courseName;
    private HashBiMap<String, Integer> grades = HashBiMap.create();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String subject, int grade) {
        /* write */ grades.put(subject, grade);
    }

    public int getGrade(String subject) {
        /* read */ return grades.get(subject);
    }
}
