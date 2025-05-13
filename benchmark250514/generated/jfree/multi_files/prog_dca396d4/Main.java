import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create LegendManager and use the write method
        LegendManager legendManager = new LegendManager("Sample Legend");
        legendManager.setLegendLabelPaint(Color.RED);

        // Create LegendDisplay and use the read method
        LegendDisplay legendDisplay = new LegendDisplay(legendManager.getLegendItem());
        legendDisplay.displayLegendDetails();

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Display course details
        course.displayCourseDetails();
    }
}