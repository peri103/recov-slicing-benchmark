import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addNoteChar('H');
        student.addNoteChar('i');
        student.addNoteChar('!');
        
        Course course = new Course("Mathematics");
        course.addStudent(student);

        System.out.println("Course: " + course.getName());
        
        List<Student> students = course.getStudents();
        for (Student s : students) {
            System.out.println("Student: " + s.getName() + ", Notes: " + s.getNotes());
        }
    }
}