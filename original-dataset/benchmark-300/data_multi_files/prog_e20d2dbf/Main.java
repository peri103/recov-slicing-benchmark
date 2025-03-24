import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        DequeOperations dequeOps = new DequeOperations();
        Student student = new Student("John");

        // Adding some grades to the student
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(95);

        // Adding a value to the deque
        dequeOps.addToDeque(42);

        // Retrieving the first value from the deque
        Deque<Integer> deque = dequeOps.getDeque();
        /* read */ int value = deque.getFirst();
        System.out.println("Value from deque: " + value);

        // Displaying student grades
        System.out.println("Student grades: " + student.getGrades());
    }
}