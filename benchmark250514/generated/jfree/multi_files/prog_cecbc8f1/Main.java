import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Create DomainAxisManager to manage the domain axis
        DomainAxisManager axisManager = new DomainAxisManager(plot);

        // Create a CategoryAxis object
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");

        // Set the domain axis using DomainAxisManager
        axisManager.setDomainAxis(domainAxis);

        // Create PlotReader to read the domain axis
        PlotReader plotReader = new PlotReader(plot);

        // Retrieve and print the domain axis label
        CategoryAxis retrievedAxis = plotReader.getDomainAxis();
        System.out.println(retrievedAxis.getLabel());

        // Initialize a Course and add Students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print details of students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}