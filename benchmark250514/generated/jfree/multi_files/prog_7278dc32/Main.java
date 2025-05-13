import java.awt.Paint;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course course = new Course("Mathematics");

        course.addStudent(student);

        // Set label outline color for student's chart
        student.getChartSettings().setLabelOutlineColor(Color.RED);

        // Iterate over students in the course and retrieve their chart settings
        for (Student s : course.getStudents()) {
            /* read */ Paint labelOutlinePaint = s.getChartSettings().getPiePlot().getLabelOutlinePaint();
            System.out.println("Student: " + s.getName() + ", Label Outline Paint: " + labelOutlinePaint);
        }
    }
}