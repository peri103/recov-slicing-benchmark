public class Student {
    private String name;
    private PriorityQueue<Integer> scores = new PriorityQueue<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.offer(score);
    }

    public PriorityQueue<Integer> getScores() {
        return scores;
    }
}
