import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using StrManipulator
        StrManipulator manipulator = new StrManipulator("Hello World");
        manipulator.replaceWorldWithJava();
        
        // Creating a student and enrolling in courses
        Student student = new Student("Alice");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Courses Enrolled:");
        for (String course : student.getCourses()) {
            System.out.println(course);
        }

        // Read and print result from StrManipulator
        String result = manipulator.getResult();
        System.out.println("Manipulated String: " + result);

        // Additional operations
        ArrayList<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hi");
        greetings.add("Greetings");

        for (String greeting : greetings) {
            System.out.println(greeting + ", " + student.getName());
        }
    }
}