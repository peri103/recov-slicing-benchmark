import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);

        course.addStudent(student1);
        course.addStudent(student2);

        Deque<Student> students = course.getStudents();
        /* read */ Student firstStudent = students.getFirst();
        System.out.println("First student in the course: " + firstStudent.getName() + ", Age: " + firstStudent.getAge());
    }
}