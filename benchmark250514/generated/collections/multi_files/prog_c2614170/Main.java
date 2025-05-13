public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");

        // Adding scores to the student
        student.addScore(85);
        student.addScore(90);
        student.addScore(75);

        // Calculate total scores
        int total = student.getScores().totalScores();
        System.out.println("Total Scores: " + total);

        // Access a specific score using the read method
        /* read */ int firstScore = student.getScores().getScore(0);
        System.out.println("First Score: " + firstScore);

        // Print all scores
        for (int i = 0; i < student.getScores().size(); i++) {
            System.out.println("Score " + (i + 1) + ": " + student.getScores().getScore(i));
        }

        // Checking the student's name
        System.out.println("Student Name: " + student.getName());
    }
}