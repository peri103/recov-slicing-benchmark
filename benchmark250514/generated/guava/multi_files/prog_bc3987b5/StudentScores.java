import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class StudentScores {
    private Table<String, String, Integer> scoresTable = HashBasedTable.create();

    public void addScore(String course, int score) {
        /* write */ scoresTable.put("student1", course, score);
    }

    public int getScore(String course) {
        /* read */ return scoresTable.get("student1", course);
    }
}
