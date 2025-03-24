import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataManager manager = new DataManager();
        Student student = new Student("John Doe");

        // Adding data to the DataManager
        manager.addData("Important Data");

        // Adding grades to the student
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);

        // Reading from the DataManager
        /* read */ boolean containsData = manager.containsData("Important Data");
        System.out.println("DataManager contains 'Important Data': " + containsData);

        // Printing student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grades: " + student.getGrades());
    }
}