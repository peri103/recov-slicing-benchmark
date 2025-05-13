import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private Table<String, String, Integer> scoresTable = HashBasedTable.create();

    public void addScore(String studentName, int score) {
        /* write */ scoresTable.put(studentName, "course1", score);
    }

    public Integer getScore(String studentName) {
        /* read */ return scoresTable.get(studentName, "course1");
    }
}
