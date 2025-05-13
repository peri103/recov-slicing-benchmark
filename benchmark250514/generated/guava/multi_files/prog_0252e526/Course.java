import com.google.common.collect.LinkedHashMultimap;

public class Course {
    private LinkedHashMultimap<String, String> studentGrades = LinkedHashMultimap.create();

    public void addStudentGrade(String student, String grade) {
        /* write */ studentGrades.put(student, grade);
    }

    public LinkedHashMultimap<String, String> getStudentGrades() {
        return studentGrades;
    }
}
