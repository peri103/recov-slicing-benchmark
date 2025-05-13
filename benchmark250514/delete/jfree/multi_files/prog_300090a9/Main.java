import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create TitleManager and set title
        TitleManager titleManager = new TitleManager();
        titleManager.setTitleText("Welcome to the Course Management System");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create course and enroll students
        Course course = new Course("Math 101");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Enroll courses to students
        student1.enrollCourse("Math 101");
        student2.enrollCourse("Math 101");

        // Print enrolled students in the course
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        // Demonstrate reading the title text
        /* read */ String titleText = titleManager.getTitleText();
        System.out.println("Title: " + titleText);

        // Print courses each student is enrolled in
        System.out.println(student1.getName() + " is enrolled in: " + student1.getCourses());
        System.out.println(student2.getName() + " is enrolled in: " + student2.getCourses());
    }
}