import org.jfree.chart.LegendItem;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Creating a LegendItemWrapper and setting a shape
        LegendItemWrapper legendWrapper = new LegendItemWrapper("Sample Legend");
        Shape rectangle = new Rectangle2D.Double(0, 0, 10, 10);
        legendWrapper.setLegendShape(rectangle);

        // Creating a course and adding students to it
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        course.addStudent(student1);
        course.addStudent(student2);

        // Accessing the legend item and reading the shape
        LegendItem legendItem = legendWrapper.getLegendItem();
        /* read */ Shape shape = legendItem.getShape();

        // Printing the legend shape
        System.out.println("Legend Shape: " + shape);

        // Printing the students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
        }
    }
}