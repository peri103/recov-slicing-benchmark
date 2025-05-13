import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");
        
        System.out.println("Student Name: " + student.getName());
        
        Collection<String> courses = student.getCourses().getCourses();
        for (String course : courses) {
            System.out.println("Enrolled Course: " + course);
        }
    }
}