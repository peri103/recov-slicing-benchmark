import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        // Creating a student and adding data
        Student student = new Student("Alice");
        student.addData("testValue");

        // Creating a course and enrolling the student
        Course course = new Course("Computer Science");
        course.enrollStudent(student);

        // Checking if the data exists
        /* read */ boolean containsValue = student.checkData("testValue");
        System.out.println("Contains 'testValue' in student's data: " + containsValue);

        // Additional operations to make the program more complex
        Student student2 = new Student("Bob");
        student2.addData("anotherValue");
        course.enrollStudent(student2);

        for (Student s : course.getStudents()) {
            System.out.println("Student in course: " + s);
        }
    }
}