import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        /* write */ student.addGrade(85);

        Course course = new Course("Mathematics");
        course.addStudent(student);

        // Perform some unrelated operations
        PriorityQueue<Integer> randomNumbers = new PriorityQueue<>();
        randomNumbers.offer(10);
        randomNumbers.offer(20);
        randomNumbers.offer(30);

        while (!randomNumbers.isEmpty()) {
            System.out.println("Polled number: " + randomNumbers.poll());
        }

        // Retrieve the original grade
        PriorityQueue<Integer> grades = student.getGrades();
        /* read */ int grade = grades.poll();
        System.out.println("Original grade: " + grade);
    }
}