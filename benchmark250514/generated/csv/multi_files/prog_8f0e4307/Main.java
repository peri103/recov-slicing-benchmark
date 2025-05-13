import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Add scores to students
        student1.addScore(85);
        student2.addScore(90);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            List<Integer> scores = student.getScores().getScores();
            for (int score : scores) {
                System.out.println("Score: " + score);
            }
        }

        // Demonstrate reading a score
        List<Integer> scores = student1.getScores().getScores();
        /* read */ int score = scores.get(0);
        System.out.println("First score of " + student1.getName() + ": " + score);
    }
}