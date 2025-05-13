import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the BZip2CompressorInputStream object with a dummy InputStream
            BZip2CompressorInputStream stream = new BZip2CompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]));
            BZip2Compressor compressor = new BZip2Compressor(stream);

            // Create students and courses
            Student student1 = new Student("Alice");
            Student student2 = new Student("Bob");

            student1.addScore(85);
            student2.addScore(90);

            Course course = new Course("Mathematics");
            course.addStudent(student1);
            course.addStudent(student2);

            // Set the block size using the compressor
            compressor.setBlockSize(9);

            // Output student scores
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
                for (Integer score : student.getScores()) {
                    System.out.println("Score: " + score);
                }
            }

            // Read the block size using the compressor
            /* read */ int blockSize = compressor.getBlockSize();
            System.out.println("Block Size: " + blockSize);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}