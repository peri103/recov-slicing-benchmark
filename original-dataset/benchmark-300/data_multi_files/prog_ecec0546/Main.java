import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        student1.storeScore("Math", 95);
        student2.storeScore("Math", 85);

        // Perform some operations with the course and students
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Reading the stored score from the DataStore
        /* read */ Integer aliceScore = student1.getScore("Math");
        System.out.println("Alice's Math score: " + aliceScore);

        // Adding more students and scores
        Student student3 = new Student("Charlie", 21);
        course.addStudent(student3);
        student3.storeScore("Math", 90);

        // Printing all students and their scores
        for (Student student : course.getStudents()) {
            Integer score = student.getScore("Math");
            System.out.println("Student: " + student.getName() + ", Math Score: " + score);
        }
    }
}