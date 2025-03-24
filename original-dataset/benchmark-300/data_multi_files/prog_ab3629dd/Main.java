import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Science");
        courses.add("History");

        Random random = new Random();
        for (String course : courses) {
            int grade = random.nextInt(100);
            student.storeGrade(course, grade);
        }

        // Perform some operations
        System.out.println("Grades stored for Alice:");

        // Read the grade for Math
        /* read */ int mathGrade = student.getGrade("Math");
        System.out.println("Math Grade: " + mathGrade);

        // More operations
        for (String course : courses) {
            System.out.println(course + " Grade: " + student.getGrade(course));
        }
    }
}