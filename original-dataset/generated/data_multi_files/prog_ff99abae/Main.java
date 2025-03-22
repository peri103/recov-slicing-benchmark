public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        course.addStudent("Alice");
        Student alice = course.getStudent("Alice");
        
        alice.addScore(95);
        alice.addScore(85);
        
        Vector<Integer> scores = alice.getScores();
        /* read */ int firstScore = scores.get(0);
        System.out.println("Alice's first score: " + firstScore);
        
        for (int score : scores) {
            System.out.println("Score: " + score);
        }
    }
}