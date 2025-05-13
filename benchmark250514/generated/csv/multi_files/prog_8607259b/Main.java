import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // CSV comment writing and reading
            CommentWriter commentWriter = new CommentWriter();
            commentWriter.writeComment("This is a comment");

            CommentReader commentReader = new CommentReader();
            String comment = commentReader.readComment(commentWriter.getCsvContent());
            System.out.println("Comment: " + comment);

            // Student score management
            Student student = new Student("John Doe");
            student.addScore(85);
            student.addScore(92);
            student.addScore(78);

            System.out.println("Scores for " + student.getName() + ": " + student.getScores());

            // Additional logic for processing scores
            int total = 0;
            for (int score : student.getScores()) {
                total += score;
            }
            double average = (double) total / student.getScores().size();
            System.out.println("Average score: " + average);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}