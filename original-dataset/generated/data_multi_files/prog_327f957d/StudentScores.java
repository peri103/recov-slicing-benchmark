import java.util.LinkedList;

public class StudentScores {
    private LinkedList<Integer> scores = new LinkedList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public int getScore(int index) {
        return scores.get(index);
    }
    
    public LinkedList<Integer> getAllScores() {
        return scores;
    }
}
