import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.storeGrade("Math", 95);
        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(student);

        mathCourse.displayEnrolledStudents();
        /* read */ int mathGrade = student.getGrade("Math");
        System.out.println("Alice's Math Grade: " + mathGrade);

        // Adding more complexity
        Student bob = new Student("Bob");
        bob.storeGrade("Science", 88);
        mathCourse.enrollStudent(bob);

        System.out.println("Bob's Science Grade: " + bob.getGrade("Science"));
        mathCourse.displayEnrolledStudents();
    }
}