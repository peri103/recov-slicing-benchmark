import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class Main {
    public static void main(String[] args) {
        // Initialize the BZip2CompressorInputStream object
        BZip2CompressorInputStream bzip2InputStream = new BZip2CompressorInputStream(System.in);

        // Create a CompressorSettings object and set the block size
        CompressorSettings compressorSettings = new CompressorSettings(bzip2InputStream);
        compressorSettings.setBlockSize(9);

        // Create a Course object and add student scores
        Course course = new Course("Mathematics");
        course.addStudentScore("Alice", 85);
        course.addStudentScore("Bob", 92);
        course.addStudentScore("Charlie", 78);

        // Calculate and print the total score
        int totalScore = course.getTotalScore();
        System.out.println("Total score of all students: " + totalScore);

        // Read the block size using the read method
        /* read */ int blockSize = compressorSettings.getBlockSize();

        // Print the block size to verify
        System.out.println("Block size: " + blockSize);

        // Perform some mathematical operations
        int result = totalScore * blockSize;
        System.out.println("Result of multiplication: " + result);
    }
}