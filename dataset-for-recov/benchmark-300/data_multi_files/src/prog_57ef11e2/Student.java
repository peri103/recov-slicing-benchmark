public class Student {
    private String name;
    private LinkedList<Integer> scores = new LinkedList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        /* write */ scores.addFirst(score);
    }

    public LinkedList<Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
