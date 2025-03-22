public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(92);
        student.addScore(78);
        
        // Retrieving and printing a specific score
        /* read */ int score = student.getScore(0);
        System.out.println("First score of Alice: " + score);

        // Additional operations
        for (int i = 0; i < 3; i++) {
            int retrievedScore = student.getScore(i);
            System.out.println("Score " + (i + 1) + ": " + retrievedScore);
        }
    }
}