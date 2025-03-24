import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.storeGrade("Math", 95);

        // Create and manipulate other data structures
        ArrayList<Integer> gradesList = new ArrayList<>();
        LinkedList<String> subjectsList = new LinkedList<>();

        gradesList.add(85);
        gradesList.add(90);
        subjectsList.add("Science");
        subjectsList.add("History");

        for (int grade : gradesList) {
            System.out.println("Grade in list: " + grade);
        }

        for (String subject : subjectsList) {
            System.out.println("Subject in list: " + subject);
        }

        /* read */ int mathGrade = student.getGrade("Math");
        System.out.println("Grade in Math: " + mathGrade);
    }
}