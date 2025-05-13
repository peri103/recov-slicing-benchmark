import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class GradeBook {
    private AbstractSortedMapDecorator<String, Integer> grades = new AbstractSortedMapDecorator<>(new TreeMap<>());

    public void assignGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public int getGrade(String studentName) {
        return grades.get(studentName);
    }
}
