import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipHelper gzipHelper = new GzipHelper();
        gzipHelper.setFilename("example.txt");

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addGrade(85);
        student1.addGrade(90);

        student2.addGrade(78);
        student2.addGrade(88);

        course.addStudent(student1);
        course.addStudent(student2);

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Retrieve and print the filename set in GzipHelper
        /* read */ String filename = gzipHelper.getFilename();
        System.out.println("Filename: " + filename);
    }
}