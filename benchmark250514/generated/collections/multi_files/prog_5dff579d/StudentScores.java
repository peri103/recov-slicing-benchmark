import org.apache.commons.collections4.set.ListOrderedSet;

public class StudentScores {
    private ListOrderedSet<Integer> scores = new ListOrderedSet<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public int getScore(int index) {
        /* read */ return scores.get(index);
    }
}
