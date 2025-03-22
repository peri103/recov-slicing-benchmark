import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.getScores().addScore("Math", 90);
        student2.getScores().addScore("Math", 85);

        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        ArrayList<Student> students = mathCourse.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            /* read */ Integer score = student.getScores().getScore("Math");
            System.out.println("Score in Math: " + score);
        }
    }
}