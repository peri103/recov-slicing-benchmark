import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollInCourse("Mathematics");
        student.enrollInCourse("Science");

        // Perform some unrelated operations
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Retrieve the courses
        /* read */ Collection<String> courses = student.getCourses();
        System.out.println("Courses enrolled by John: " + courses);

        // Additional operations
        Student anotherStudent = new Student("Jane");
        anotherStudent.enrollInCourse("History");
        Collection<String> janeCourses = anotherStudent.getCourses();
        System.out.println("Courses enrolled by Jane: " + janeCourses);
    }
}