import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        course.addStudent(student);

        student.processData(42);

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            Student newStudent = new Student("Student" + i);
            course.addStudent(newStudent);
            newStudent.processData(i * 10);
        }

        /* read */ Integer value = student.getDataQueue().peekLast();
        System.out.println(value);

        // More unrelated operations
        for (Student s : course.getStudents()) {
            System.out.println(s.getDataQueue().peekLast());
        }
    }
}