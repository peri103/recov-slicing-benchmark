public class Student {
    private String name;
    private ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        scores.putIfAbsent(subject, score);
    }

    public ConcurrentHashMap<String, Integer> getScores() {
        return scores;
    }
}
