import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        ArrayList<String> subjects = new ArrayList<>();
        LinkedList<Integer> grades = new LinkedList<>();

        subjects.add("Math");
        subjects.add("Science");
        grades.add(90);
        grades.add(85);

        student.storeGrade(subjects.get(0), grades.get(0));
        student.storeGrade(subjects.get(1), grades.get(1));

        for (String subject : subjects) {
            System.out.println("Subject: " + subject);
        }

        for (Integer grade : grades) {
            System.out.println("Grade: " + grade);
        }

        /* read */ Integer mathGrade = student.getGrade(subjects.get(0));
        System.out.println("Math Grade: " + mathGrade);

        subjects.add("History");
        grades.add(88);

        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Subject at index " + i + ": " + subjects.get(i));
        }

        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade at index " + i + ": " + grades.get(i));
        }
    }
}