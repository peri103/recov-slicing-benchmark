public class Student {
    private String name;
    private Deque<Integer> scores = new java.util.ArrayDeque<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        /* write */ scores.addFirst(score);
    }

    public Deque<Integer> getScores() {
        return scores;
    }
}
