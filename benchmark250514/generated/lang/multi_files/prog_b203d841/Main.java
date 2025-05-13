import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using the HashCodeWriter and HashCodeReader
        HashCodeWriter writer = new HashCodeWriter();
        writer.appendValue(12345);

        HashCodeReader reader = new HashCodeReader();
        int hashCode = reader.readHashCode(writer.getBuilder());
        System.out.println("HashCode: " + hashCode);

        // Unrelated operations with Student and Course
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course = new Course("Math");
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }
    }
}