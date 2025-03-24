import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Adding a score to the student
        student.addScore(95);

        // Adding the student to the course
        course.addStudent(student);

        // Retrieving the score from the student
        LinkedList<Integer> scores = student.getScores();
        /* read */ int score = scores.getFirst();

        System.out.println("Student: " + student.getName() + ", Score: " + score);
        System.out.println("Course: " + course.getCourseName());

        // Adding more students to the course
        Student student2 = new Student("Bob");
        student2.addScore(85);
        course.addStudent(student2);

        // Printing all students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName() + ", Score: " + s.getScores().getFirst());
        }
    }
}