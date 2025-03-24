public class Student {
    private String name;
    private ConcurrentLinkedDeque<Integer> scores = new ConcurrentLinkedDeque<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.addFirst(score);
    }

    public ConcurrentLinkedDeque<Integer> getScores() {
        return scores;
    }
}
