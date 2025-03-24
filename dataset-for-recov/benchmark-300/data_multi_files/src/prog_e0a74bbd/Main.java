import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        course.addStudent(student1);
        course.addStudent(student2);

        Random random = new Random();
        student1.storeScore("Math", random.nextInt(100));
        student2.storeScore("Math", random.nextInt(100));

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getScore("Math"));
        }

        // Read the value written by the write method
        /* read */ int value = student1.getScore("Math");
        System.out.println("Alice's Math score: " + value);
    }
}