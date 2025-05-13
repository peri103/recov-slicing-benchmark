import java.util.List;

public class Main {
    public static void main(String[] args) {
        DotRendererManager rendererManager = new DotRendererManager();
        Course course = new Course("Mathematics");
        
        // Set dot width using the manager
        rendererManager.setDotWidth(5);
        
        // Add students to the course
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        course.addStudent(student1);
        course.addStudent(student2);
        
        // Retrieve and print student details
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve the dot width from the renderer
        /* read */ int dotWidth = rendererManager.getDotWidth();
        System.out.println("Dot width from renderer: " + dotWidth);
    }
}