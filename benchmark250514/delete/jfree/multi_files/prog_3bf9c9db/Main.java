import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a renderer wrapper and set custom paint
        XYStepAreaRendererWrapper rendererWrapper = new XYStepAreaRendererWrapper();
        rendererWrapper.setCustomDomainPaint(Color.RED);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve and print the custom domain paint
        /* read */ Paint domainPaint = rendererWrapper.getCustomDomainPaint();
        System.out.println("Domain Paint: " + domainPaint);
    }
}