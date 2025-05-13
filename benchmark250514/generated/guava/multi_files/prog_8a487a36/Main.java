import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Science");

        System.out.println("First enrolled course: " + student.getFirstCourse());

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student);

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue().getFirstCourse());
        }

        Student anotherStudent = new Student("Jane Doe");
        anotherStudent.enrollCourse("History");
        anotherStudent.enrollCourse("Geography");

        studentMap.put(2, anotherStudent);

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", First Course: " + entry.getValue().getFirstCourse());
        }
    }
}