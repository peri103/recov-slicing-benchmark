import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Manage block size
            BlockSizeManager blockSizeManager = new BlockSizeManager();
            blockSizeManager.setBlockSize(900);

            // Create a student and manage scores
            Student student = new Student("Alice");
            student.addScore(85);
            student.addScore(92);
            student.addScore(76);

            // Calculate average score
            double averageScore = student.getAverageScore();
            System.out.println("Average Score: " + averageScore);

            // Get block size
            int blockSize = blockSizeManager.getBlockSize();
            System.out.println("Block Size: " + blockSize);
            
            // More student score operations
            ArrayList<Integer> scores = new ArrayList<>(student.getScores());
            scores.add(88);
            System.out.println("Updated Scores: " + scores);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}