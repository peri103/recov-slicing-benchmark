import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the BZip2CompressorInputStream with a dummy InputStream
            BZip2CompressorInputStream bzip2Stream = new BZip2CompressorInputStream(System.in);

            // Handle BZip2 Stream
            BZip2StreamHandler streamHandler = new BZip2StreamHandler(bzip2Stream);
            streamHandler.setBlockSize(900000);

            // Create a course and add students
            Course course = new Course("Mathematics");
            Student student1 = new Student("Alice");
            student1.addScore(85);
            student1.addScore(90);
            course.addStudent(student1);

            Student student2 = new Student("Bob");
            student2.addScore(78);
            student2.addScore(88);
            course.addStudent(student2);

            // Calculate and print the average score of the course
            double averageScore = course.getAverageScore();
            System.out.println("Average Score: " + averageScore);

            // Read and print block size
            int blockSize = streamHandler.getBlockSize();
            System.out.println("Block size: " + blockSize);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}