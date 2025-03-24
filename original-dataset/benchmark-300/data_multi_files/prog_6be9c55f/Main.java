import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        course.addStudent(new Student("Charlie", 19));

        PriorityQueue<Student> students = course.getStudents();
        /* read */ Student youngestStudent = students.peek();
        System.out.println("Youngest student: " + youngestStudent.getName() + ", Age: " + youngestStudent.getAge());

        while (!students.isEmpty()) {
            Student student = students.poll();
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}