import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        Course math = new Course("Mathematics");
        math.addStudentScore(student1.getName(), 85);
        math.addStudentScore(student2.getName(), 90);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);

        System.out.println("Students in Mathematics course:");
        for (String studentName : studentMap.keySet()) {
            Student student = studentMap.get(studentName);
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Retrieving and printing scores for a specific student
        Set<Integer> aliceScores = math.getStudentScores(student1.getName());
        for (Integer score : aliceScores) {
            /* read */ System.out.println("Alice's score in Mathematics: " + score);
        }
    }
}