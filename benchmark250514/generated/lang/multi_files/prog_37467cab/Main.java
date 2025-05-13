import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Student student = new Student("Alice", currentDate);
        Course course = new Course("History 101");
        course.addStudent(student);

        Date resultDate = student.performDateOperation(5);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Original Date: " + sdf.format(currentDate));
        System.out.println("Date after operation: " + sdf.format(resultDate));
    }
}