import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(42);
        
        Course course = new Course("Mathematics");
        course.addStudent(student);
        
        // Adding unrelated operations
        LinkedList<Integer> list3 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(i * 10);
        }
        
        List<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println(score);
        
        // Adding more complex operations
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(i * 20);
        }
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }
}