import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 22);

        Course course = new Course("Mathematics");
        course.addStudent(alice);
        course.addStudent(bob);

        GradeBook gradeBook = new GradeBook();
        gradeBook.assignGrade(alice.getName(), 85);
        gradeBook.assignGrade(bob.getName(), 90);

        List<Student> students = course.getStudents();
        for (Student student : students) {
            /* read */ int grade = gradeBook.getGrade(student.getName());
            System.out.println(student.getName() + " received a grade of " + grade);
        }
    }
}