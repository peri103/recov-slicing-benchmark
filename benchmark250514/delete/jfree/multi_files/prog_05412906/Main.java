import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create and configure chart
        ChartUtils chartUtils = new ChartUtils();
        chartUtils.configureChart();

        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        math.enrollStudent(alice);
        science.enrollStudent(bob);

        // Display enrolled students
        for (Student student : math.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + math.getName());
        }

        for (Student student : science.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + science.getName());
        }

        // Retrieve and display the outline paint from the chart
        PiePlot piePlot = chartUtils.getPiePlot();
        /* read */ Paint outlinePaint = piePlot.getOutlinePaint();
        System.out.println("Pie Plot Outline Paint: " + outlinePaint);
    }
}