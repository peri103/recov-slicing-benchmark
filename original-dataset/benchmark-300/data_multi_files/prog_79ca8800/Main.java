import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        /* write */ dataManager.addData(10);

        Student student1 = new Student("Alice");
        student1.addScore(85);
        student1.addScore(90);

        Student student2 = new Student("Bob");
        student2.addScore(75);
        student2.addScore(80);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Course course = new Course("Mathematics", students);
        course.printStudentScores();

        /* read */ boolean containsValue = dataManager.containsData(10);
        System.out.println("DataManager contains 10: " + containsValue);
    }
}