import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateOperations dateOps = new DateOperations();

        Date currentDate = new Date();
        Date futureDate = dateOps.addYearsToDate(currentDate, 5);

        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        Course course = new Course("Mathematics");
        course.addStudent(student);

        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName());
            System.out.println("Scores: " + s.getScores());
        }

        Date truncatedDate = dateOps.truncateDate(futureDate);
        System.out.println("Truncated Future Date: " + truncatedDate);
    }
}