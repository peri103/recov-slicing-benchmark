import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        Course course = new Course("Mathematics");
        System.out.println("Course: " + course.getCourseName());

        for (Integer score : course.getScores()) {
            System.out.println("Score: " + score);
        }

        int sum = 0;
        for (Integer score : course.getScores()) {
            sum += score;
        }
        System.out.println("Total Score: " + sum);

        Map<String, String> details = new HashMap<>();
        details.put("Instructor", "Dr. Smith");
        details.put("Semester", "Fall 2023");

        for (Map.Entry<String, String> entry : details.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}