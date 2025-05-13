import org.apache.commons.collections4.list.CursorableLinkedList;

public class StudentScores {
    private CursorableLinkedList<Integer> scores = new CursorableLinkedList<>();

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public int getScore(int index) {
        return scores.get(index);
    }

    public int totalScores() {
        int total = 0;
        for (Integer score : scores) {
            total += score;
        }
        return total;
    }

    public int size() {
        return scores.size();
    }
}
