import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Managing pie plot section outlines
        PiePlotManager plotManager = new PiePlotManager();
        plotManager.setSectionOutline("Section1", Color.RED);

        // Creating a course and adding students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);
        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        // Displaying students in the course
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // More complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Reading the outline paint for a section
        /* read */ Color outlinePaint = plotManager.getSectionOutline("Section1");
        System.out.println("Outline paint for Section1: " + outlinePaint);

        // Additional complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);
    }
}