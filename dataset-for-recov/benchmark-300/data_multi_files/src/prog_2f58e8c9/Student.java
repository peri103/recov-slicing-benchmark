public class Student {
    private String name;
    private ConcurrentSkipListSet<Integer> scores = new ConcurrentSkipListSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public ConcurrentSkipListSet<Integer> getScores() {
        return scores;
    }
}
