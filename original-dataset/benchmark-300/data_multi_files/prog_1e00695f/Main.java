import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        mathCourse.enrollStudent(student1.getId());
        mathCourse.enrollStudent(student2.getId());

        CopyOnWriteArraySet<Integer> studentIds = mathCourse.getStudentIds();
        /* read */ boolean isAliceEnrolled = studentIds.contains(student1.getId());
        System.out.println("Is Alice enrolled in the course? " + isAliceEnrolled);

        // Adding more students
        Student student3 = new Student(3, "Charlie");
        mathCourse.enrollStudent(student3.getId());

        // Printing all enrolled students
        for (Integer id : studentIds) {
            System.out.println("Student ID: " + id);
        }
    }
}