import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addData(42);

        Course course = new Course("Computer Science");
        course.addStudent(student);

        LinkedList<Course> courses = new LinkedList<>();
        courses.add(course);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        for (Course c : courses) {
            for (Student s : c.getStudents()) {
                /* read */ boolean containsValue = s.checkData(42);
                System.out.println("Does the student's data contain 42? " + containsValue);
            }
        }

        for (Student s : students) {
            System.out.println("Student: " + s);
        }
    }
}