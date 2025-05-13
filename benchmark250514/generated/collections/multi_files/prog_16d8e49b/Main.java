import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course mathCourse = new Course("Mathematics");

        student.enrollCourse(mathCourse);

        mathCourse.submitAssignment(student.getName(), "Algebra Assignment");
        mathCourse.submitAssignment(student.getName(), "Geometry Assignment");

        // Unrelated logic to add complexity
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Retrieve assignments
        Collection<String> assignments = mathCourse.getAssignments(student.getName());

        /* read */ 
        for (String assignment : assignments) {
            System.out.println("Assignment submitted by " + student.getName() + ": " + assignment);
        }
    }
}