import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        
        // Using the GzipParametersWrapper to set a comment
        gzipWrapper.setComment("This is a test comment");

        // Creating a Course and enrolling Students
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.addScore(85);
        bob.addScore(92);

        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        // Displaying enrolled students and their scores
        for (Student student : mathCourse.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Scores: " + student.getScores());
        }

        // More unrelated code
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("apple", 10);
        dataMap.put("banana", 20);
        int totalValue = 0;
        for (Integer value : dataMap.values()) {
            totalValue += value;
        }
        System.out.println("Total Value: " + totalValue);

        // Reading the comment from GzipParametersWrapper
        /* read */ String comment = gzipWrapper.getComment();
        System.out.println("Gzip Comment: " + comment);
    }
}