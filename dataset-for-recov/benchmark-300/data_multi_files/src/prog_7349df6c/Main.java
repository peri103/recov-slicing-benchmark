import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science 101");
        Student student = new Student("Alice", 12345);
        
        course.enrollStudent(student);
        student.storeGrade("A");
        
        List<Student> students = course.getEnrolledStudents();
        for (Student s : students) {
            /* read */ String grade = s.getGrade();
            System.out.println("Student " + s.getName() + " has grade: " + grade);
        }
    }
}