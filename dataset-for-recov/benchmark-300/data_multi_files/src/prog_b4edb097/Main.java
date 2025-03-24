import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        alice.addGrade(85);
        bob.addGrade(90);

        // Perform some operations
        for (Student student : mathCourse.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + mathCourse.getCourseName());
        }

        // Read from the priority queue
        /* read */ int aliceGrade = alice.getGrades().peek();
        System.out.println("Alice's grade: " + aliceGrade);

        // Additional unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);
    }
}