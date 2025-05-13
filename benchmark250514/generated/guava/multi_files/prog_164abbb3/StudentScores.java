import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class StudentScores {
    private Table<String, String, Integer> scoresTable = TreeBasedTable.create();

    public void addScore(String studentName, String courseName, int score) {
        /* write */ scoresTable.put(studentName, courseName, score);
    }

    public Integer getScore(String studentName, String courseName) {
        return scoresTable.get(studentName, courseName);
    }
}
