import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a TextProcessor instance
        TextProcessor textProcessor = new TextProcessor("Hello World");
        
        // Create a Course and add Students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        course.addStudent(student1);
        course.addStudent(student2);

        // Perform operations on the Course
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Use write method in TextProcessor
        textProcessor.deleteFirstOccurrence("Hello");

        // Use read method in TextProcessor
        /* read */ String result = textProcessor.getText();
        System.out.println("Processed Text: " + result);
    }
}