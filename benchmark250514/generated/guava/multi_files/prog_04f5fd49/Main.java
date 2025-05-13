import com.google.common.collect.TreeMultimap;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.addStudentScore("Alice", 85);
        course.addStudentScore("Bob", 90);
        
        TreeMultimap<String, Integer> allScores = course.getStudentScores();
        
        Student alice = new Student("Alice", allScores);
        alice.addScore(95);
        
        Student bob = new Student("Bob", allScores);
        bob.addScore(88);
        
        // Retrieve and print Alice's first score
        /* read */ Integer aliceFirstScore = allScores.get("Alice").first();
        System.out.println("Alice's first score: " + aliceFirstScore);
        
        // Additional operations
        for (String student : allScores.keySet()) {
            System.out.println("Scores for " + student + ": " + allScores.get(student));
        }
    }
}