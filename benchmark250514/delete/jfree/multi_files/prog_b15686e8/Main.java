import org.jfree.chart.labels.CrosshairLabelGenerator;

public class Main {
    public static void main(String[] args) {
        // Create a CrosshairLabelManager and set a label generator
        CrosshairLabelManager manager = new CrosshairLabelManager();
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(org.jfree.chart.plot.Crosshair crosshair) {
                return "Crosshair Label";
            }
        };
        
        manager.setLabelGenerator(labelGenerator);

        // Create a Course and enroll students
        Course course = new Course("Mathematics");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");

        // Retrieve and use the label generator from the manager
        /* read */ CrosshairLabelGenerator readLabelGenerator = manager.getLabelGenerator();
        System.out.println("Generated Label: " + readLabelGenerator.generateLabel(manager.crosshair));

        // Output enrolled students
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Enrolled Students: " + course.getEnrolledStudents());
    }
}