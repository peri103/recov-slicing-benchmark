import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVManager csvManager = new CSVManager();
        csvManager.addComment("This is a comment");
        
        Student student = new Student("John Doe");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(95);
        
        List<CSVRecord> records = csvManager.getRecords();
        CommentExtractor commentExtractor = new CommentExtractor();
        List<String> extractedComments = commentExtractor.extractComments(records);

        for (String extractedComment : extractedComments) {
            System.out.println("Extracted comment: " + extractedComment);
        }

        List<Integer> grades = student.getGrades();
        for (int grade : grades) {
            System.out.println(student.getName() + "'s grade: " + grade);
        }

        /* read */ String comment = records.get(0).getComment();
        System.out.println("Original comment: " + comment);
    }
}