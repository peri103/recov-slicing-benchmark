import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Java Programming");
        
        // Create students and add grades
        Student student1 = new Student("Alice");
        student1.addGrade(85);
        student1.addGrade(90);
        
        Student student2 = new Student("Bob");
        student2.addGrade(78);
        student2.addGrade(82);
        
        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);
        
        // Use GzipConfig class
        GzipConfig gzipConfig = new GzipConfig();
        gzipConfig.setISize(12345);
        
        // Display course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }
        
        // Use GzipConfig read method
        /* read */ int iSize = gzipConfig.getISize();
        System.out.println("Gzip ISize: " + iSize);
    }
}