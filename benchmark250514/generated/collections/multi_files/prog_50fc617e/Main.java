import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("Bob", course);
        
        student.addScore(95);
        student.addScore(85);
        
        List<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("First score for Bob: " + score);
        
        // Additional operations
        Student anotherStudent = new Student("Alice", course);
        anotherStudent.addScore(88);
        
        List<Integer> aliceScores = anotherStudent.getScores();
        for (int aliceScore : aliceScores) {
            System.out.println("Alice's score: " + aliceScore);
        }
    }
}