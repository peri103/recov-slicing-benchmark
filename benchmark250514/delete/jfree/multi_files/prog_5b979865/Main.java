import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Art 101");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        Stroke alternateStroke = new BasicStroke(3.0f);
        student1.setStrokeForSeries(1, alternateStroke);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            /* read */ Stroke retrievedStroke = student.getStrokeForSeries(0);
            System.out.println("Retrieved Stroke: " + retrievedStroke);
        }
    }
}