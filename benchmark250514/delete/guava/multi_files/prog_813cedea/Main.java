public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.addScore("Math", 95);

        System.out.println("Student: " + student.getName());

        // Check if the student has a score for Math
        boolean hasMathScore = student.getScores().containsSubject("Math");
        System.out.println("Has Math Score: " + hasMathScore);

        // Perform additional operations
        int totalScore = 0;
        for (int i = 1; i <= 3; i++) {
            totalScore += i * 10;
        }
        System.out.println("Total calculated score: " + totalScore);
    }
}