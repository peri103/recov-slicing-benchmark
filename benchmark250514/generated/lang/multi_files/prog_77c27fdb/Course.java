import java.util.ArrayList;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class Course {
    private String courseName;
    private ArrayList<Student> students;
    private EqualsBuilder equalsBuilder;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.equalsBuilder = new EqualsBuilder();
    }

    public void addStudent(Student student) {
        students.add(student);
        /* write */ equalsBuilder.append(student.getName(), student.getName());
    }

    public boolean areStudentsEqual(int index1, int index2) {
        if (index1 < students.size() && index2 < students.size()) {
            Student student1 = students.get(index1);
            Student student2 = students.get(index2);
            equalsBuilder.append(student1.getName(), student2.getName());
            return equalsBuilder.isEquals();
        }
        return false;
    }
}
