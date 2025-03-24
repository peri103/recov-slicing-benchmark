import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        course.addStudent(student);

        student.addData(100);

        List<Student> students = course.getStudents();
        for (Student s : students) {
            /* read */ boolean containsValue = s.checkData(100);
            System.out.println("Student " + s + " contains 100: " + containsValue);
        }
    }
}