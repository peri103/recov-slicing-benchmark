import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.storeGrade("Math", 95);
        student.storeGrade("Science", 88);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");

        for (String subject : subjects) {
            System.out.println("Subject: " + subject + ", Grade: " + student.getGrade(subject));
        }

        /* read */ Integer mathGrade = student.getGrade("Math");
        System.out.println("Math Grade: " + mathGrade);

        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(student);

        for (Student s : studentList) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
    }
}