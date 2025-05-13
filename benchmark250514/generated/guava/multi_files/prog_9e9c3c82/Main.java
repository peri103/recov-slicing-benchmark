import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        Course mathCourse = new Course("Mathematics");

        student.enrollCourse(mathCourse);

        // Perform some operations with the student and course
        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled in: " + student.getCourse().getCourseName());

        // Retrieve grades from the course
        Map<String, Integer> grades = student.getCourse().getGrades();

        // Iterate over grades and print them
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println("Grade for " + entry.getKey() + ": " + entry.getValue());
        }

        // Retrieve and print a specific grade using the read method
        /* read */ Integer assignment1Grade = mathCourse.getGrades().get("Assignment1");
        System.out.println("Grade for Assignment1: " + assignment1Grade);
    }
}