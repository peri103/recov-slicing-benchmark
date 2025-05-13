import java.awt.Color;
import java.awt.Paint;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a PlotManager instance and set a plot background color
        PlotManager plotManager = new PlotManager();
        plotManager.setPlotBackground(Color.RED);

        // Create Student and Course instances
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);

        // Enroll student in courses
        student.enrollCourse(math);
        student.enrollCourse(science);

        // Output student details
        System.out.println("Student: " + student.getName());
        List<Course> courses = student.getCourses();
        for (Course course : courses) {
            System.out.println("Enrolled in: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
        }

        // Retrieve and print the plot background color
        /* read */ Paint paint = plotManager.getPlotBackground();
        System.out.println("Plot background color: " + paint);
    }
}