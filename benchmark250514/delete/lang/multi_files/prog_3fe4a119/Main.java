import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Date manipulation
        DateManipulator dateManipulator = new DateManipulator();
        dateManipulator.setSeconds(30);

        // Create a student and add scores
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        // Retrieve and print student information
        List<Integer> scores = student.getScores();
        System.out.println("Scores for " + student.getName() + ": " + scores);

        // Truncate the date
        DateTruncator dateTruncator = new DateTruncator();
        Date truncatedDate = dateTruncator.truncateDate(dateManipulator.getDate());
        System.out.println("Truncated Date: " + truncatedDate);
    }
}