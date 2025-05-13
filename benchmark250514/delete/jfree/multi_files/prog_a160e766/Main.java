import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize PaintManager and set label shadow paint
        PaintManager paintManager = new PaintManager();
        paintManager.setLabelShadowPaint();

        // Initialize Student and enroll in courses
        Student student = new Student("Alice");
        student.enrollCourse("Math");
        student.enrollCourse("Science");

        // Retrieve and print student's courses
        List<String> courses = student.getCourses();
        System.out.println(student.getName() + " is enrolled in: " + courses);

        // Retrieve and print the label shadow paint
        /* read */ Paint readShadowPaint = paintManager.getLabelShadowPaint();
        System.out.println("Pie Plot Label Shadow Paint: " + readShadowPaint);
    }
}