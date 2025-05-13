import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Initialize a ChartPanel with a dummy JFreeChart
        PiePlot plot = new PiePlot();
        JFreeChart chart = new JFreeChart(plot);
        ChartPanel chartPanel = new ChartPanel(chart);

        // Configure chart settings
        ChartConfiguration chartConfig = new ChartConfiguration(chartPanel);
        chartConfig.enableMouseWheel();

        // Create a Course and add Students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Read the chart configuration
        /* read */ boolean isMouseWheelEnabled = chartConfig.isMouseWheelEnabled();
        System.out.println("Mouse Wheel Enabled: " + isMouseWheelEnabled);
    }
}