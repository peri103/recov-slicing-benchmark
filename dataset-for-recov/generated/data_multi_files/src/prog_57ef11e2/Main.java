public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);
        student.addScore(75);

        System.out.println("First score: " + student.getFirstScore());
        System.out.println("Number of scores: " + student.getNumberOfScores());

        student.addScore(95);
        System.out.println("Updated first score: " + student.getFirstScore());
    }
}