import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Computer Science");

        // Adding the student to the course
        course.addStudent(student);

        // Adding data to the student's data manager
        student.addData("Hello");

        // Checking if the data exists
        /* read */ boolean containsData = student.checkData("Hello");
        System.out.println("Student's data contains 'Hello': " + containsData);

        // Printing all students in the course
        System.out.println("Students in the course:");
        for (Student s : course.getStudents()) {
            System.out.println(s.getData());
        }
    }
}