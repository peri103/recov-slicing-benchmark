import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize StrokeManager and set stroke
        StrokeManager strokeManager = new StrokeManager();
        strokeManager.setOutlineStroke(2.0f);

        // Initialize a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getStudents().size() + " students enrolled.");
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Retrieve and print the stroke
        /* read */ Stroke readStroke = strokeManager.getOutlineStroke();
        System.out.println("Outline Stroke: " + readStroke);
    }
}