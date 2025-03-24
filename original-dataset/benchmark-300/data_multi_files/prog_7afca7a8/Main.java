import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.storeScore(95);

        List<Student> students = new ArrayList<>();
        students.add(student);

        for (Student s : students) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }

        /* read */ int score = student.getScore();
        System.out.println("The score for " + student.getName() + " is: " + score);

        // Additional unrelated code
        List<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Science");
        courses.add("History");

        for (String course : courses) {
            System.out.println("Course: " + course);
        }
    }
}