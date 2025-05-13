import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import java.util.HashMap;
import java.util.Map;

public class Course {
    private PredicatedMap<Object, Object> studentGrades;

    public Course() {
        Predicate<Object> keyPredicate = TruePredicate.truePredicate();
        Predicate<Object> valuePredicate = TruePredicate.truePredicate();
        studentGrades = PredicatedMap.predicatedMap(new HashMap<>(), keyPredicate, valuePredicate);
    }

    public void addStudentGrade(String studentName, String grade) {
        /* write */ studentGrades.put(studentName, grade);
    }

    public Object getStudentGrade(String studentName) {
        return studentGrades.get(studentName);
    }

    public Map<Object, Object> getAllGrades() {
        return studentGrades;
    }
}
