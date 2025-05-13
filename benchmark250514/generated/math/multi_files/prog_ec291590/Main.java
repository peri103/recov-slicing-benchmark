public class Main {
    public static void main(String[] args) {
        // Create a student with a symmetric matrix for scores
        Student student = new Student("John Doe", 3);

        // Set a score for a subject pair
        student.setScore(0, 1, 85.0);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read the score back from the symmetric matrix
        /* read */ double score = student.getScore(0, 1);

        // Print the score to verify it was written and read correctly
        System.out.println("Score for subjects 0 and 1: " + score);
    }
}