import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a ChartRenderer and set a paint
        ChartRenderer chartRenderer = new ChartRenderer();
        Paint paint = new Color(255, 0, 0); // Red color
        chartRenderer.setRendererPaint(0, paint);

        // Create a Course and add Students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student2.addGrade(90);

        course.addStudent(student1);
        course.addStudent(student2);

        // Iterate over students and print their grades
        for (Student student : course.getStudents()) {
            System.out.println("Grades for " + student.getName() + ": " + student.getGrades());
        }

        // Retrieve paint from the ChartRenderer
        /* read */ Paint retrievedPaint = chartRenderer.getRendererPaint(0);
        System.out.println("Retrieved paint: " + retrievedPaint);
    }
}