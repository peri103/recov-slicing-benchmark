public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore("Math", 90);
        student.addScore("Science", 85);
        student.printScores();

        /* read */ int mathScore = student.getScore("Math");
        System.out.println("Math Score: " + mathScore);

        student.addScore("History", 75);
        student.printScores();
    }
}