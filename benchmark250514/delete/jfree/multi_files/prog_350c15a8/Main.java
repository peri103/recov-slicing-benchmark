import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        ChartRenderer chartRenderer = new ChartRenderer();
        Course course = new Course("Math 101");

        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 90);

        course.addStudent(student1);
        course.addStudent(student2);

        Paint paint = Color.RED;
        chartRenderer.setOutlinePaint(paint);

        for (Student student : course.getStudents()) {
            System.out.println(student.getName() + " scored " + student.getScore());
        }

        /* read */ Paint outlinePaint = chartRenderer.getOutlinePaint();
        System.out.println("Chart Renderer Outline Paint: " + outlinePaint);
    }
}