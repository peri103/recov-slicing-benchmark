import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.ArrayList;

public class StudentScores {
    private ArrayTable<String, String, Integer> table;

    public StudentScores() {
        List<String> rowKeys = new ArrayList<>();
        List<String> columnKeys = new ArrayList<>();
        rowKeys.add("exam1");
        columnKeys.add("score");

        table = ArrayTable.create(rowKeys, columnKeys);
    }

    public void addScore(int score) {
        /* write */ table.put("exam1", "score", score);
    }

    public Integer getScore() {
        return /* read */ table.get("exam1", "score");
    }
}
