import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class StudentScores {
    private Table<String, String, Integer> scoreTable = HashBasedTable.create();

    public void addScore(String studentName, int score) {
        /* write */ scoreTable.put(studentName, "test1", score);
    }

    public Integer getScore(String studentName) {
        /* read */ return scoreTable.get(studentName, "test1");
    }
}
