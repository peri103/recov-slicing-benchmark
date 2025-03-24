public class Student {
    private String name;
    private HashMap<String, Integer> scores = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public HashMap<String, Integer> getScores() {
        return scores;
    }
}
