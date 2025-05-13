import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(hashMap, () -> 0);

        Student student = new Student("Alice");
        student.addGrade(95);

        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(student);

        Student retrievedStudent = mathCourse.getStudent("Alice");
        if (retrievedStudent != null) {
            /* read */ int grade = retrievedStudent.getGrades().get(0);
            System.out.println("Grade for " + retrievedStudent.getName() + ": " + grade);
        }

        /* write */ lazyMap.put("key", 42);

        // Further unrelated code
        int value = lazyMap.get("key");
        System.out.println("Value from LazyMap: " + value);
    }
}