import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Adding data to the DataManager
        dataManager.addData(100);

        // Adding grades to the student
        student.addGrade(85);
        student.addGrade(90);

        // Enrolling the student in the course
        course.enrollStudent(student);

        // Checking if the data is present in the DataManager
        /* read */ boolean dataExists = dataManager.containsData(100);
        System.out.println("Data exists in DataManager: " + dataExists);

        // Printing student grades
        List<Integer> grades = student.getGrades();
        for (int grade : grades) {
            System.out.println("Student " + student.getName() + " grade: " + grade);
        }

        // Printing enrolled students in the course
        List<Student> enrolledStudents = course.getEnrolledStudents();
        for (Student enrolledStudent : enrolledStudents) {
            System.out.println("Enrolled student in " + course.getCourseName() + ": " + enrolledStudent.getName());
        }
    }
}