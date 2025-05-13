import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        
        student1.setTitleText("Freshman");
        student2.setTitleText("Sophomore");
        
        course.addStudent(student1);
        course.addStudent(student2);
        
        // Display student information
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.name);
            System.out.println("Student ID: " + student.id);
            /* read */ System.out.println("Title: " + student.getTitleText());
        }
    }
}