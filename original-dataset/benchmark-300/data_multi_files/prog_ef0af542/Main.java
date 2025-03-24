public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(10);
        PriorityQueue<Integer> scores = student.getScores();
        /* read */ int score = scores.peek();
        System.out.println("Peeked value from queue: " + score);
    }
}