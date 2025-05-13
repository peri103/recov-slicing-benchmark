import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enrollCourse("CS101", "Introduction to Computer Science");
        student.enrollCourse("MATH101", "Calculus I");

        student.addScore("CS101", 95);
        student.addScore("MATH101", 88);

        Map<String, String> courses = student.getCourses();
        for (Map.Entry<String, String> entry : courses.entrySet()) {
            System.out.println("Course Code: " + entry.getKey() + ", Course Name: " + entry.getValue());
        }

        /* read */ Integer csScore = student.getScore("CS101");
        System.out.println("CS101 Score: " + csScore);

        Integer mathScore = student.getScore("MATH101");
        System.out.println("MATH101 Score: " + mathScore);
    }
}