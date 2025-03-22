import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);
        student.addScore(95);

        List<Integer> scores = student.getScores();
        System.out.println(student.getName() + "'s Scores: " + scores);

        int latestScore = student.getScores().get(student.getScores().size() - 1);
        System.out.println("Latest score added: " + latestScore);

        // Retrieve and print the latest score using the Hashtable
        int scoreFromTable = student.getScores().get(student.getScores().size() - 1);
        System.out.println("Retrieved latest score from Hashtable: " + scoreFromTable);
    }
}