import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class StudentScores {
    private Table<String, String, Integer> scoresTable = HashBasedTable.create();

    public void addScore(String subject, Integer score) {
        /* write */ scoresTable.put("student", subject, score);
    }

    public Integer getScore(String subject) {
        return scoresTable.get("student", subject);
    }
}
