import org.jfree.chart.labels.CrosshairLabelGenerator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CrosshairLabelHandler
        CrosshairLabelHandler labelHandler = new CrosshairLabelHandler();

        // Set a custom label generator
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Custom Crosshair Label";
            }
        };
        labelHandler.setCustomLabelGenerator(labelGenerator);

        // Create a course and enroll students
        Course course = new Course("Mathematics");
        course.enrollStudent(new Student("Alice", 101));
        course.enrollStudent(new Student("Bob", 102));

        // Retrieve and display students
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentID());
        }

        // Retrieve the label generator and use it
        /* read */ CrosshairLabelGenerator retrievedGenerator = labelHandler.getLabelGenerator();
        System.out.println(retrievedGenerator.generateLabel(null));
    }
}