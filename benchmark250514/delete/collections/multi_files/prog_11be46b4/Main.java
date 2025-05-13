import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        Course course = new Course("Computer Science");

        course.enrollStudent(student);
        student.addScore(95);

        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Student Name: " + enrolledStudent.getName());
            System.out.println("Student Age: " + enrolledStudent.getAge());
            System.out.println("Course: " + course.getCourseName());

            /* read */ Integer latestScore = enrolledStudent.getScores().getLatestScore().iterator().next();
            System.out.println("Latest Score: " + latestScore);
        }

        student.getScores().addExtraScore("midterm", 85);
        student.getScores().addExtraScore("final", 90);

        Collection<Integer> midtermScores = student.getScores().getScore("midterm");
        Collection<Integer> finalScores = student.getScores().getScore("final");

        System.out.println("Midterm Score: " + midtermScores.iterator().next());
        System.out.println("Final Score: " + finalScores.iterator().next());
    }
}