import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class School {
    private Table<String, String, Integer> studentScores;

    public School() {
        studentScores = HashBasedTable.create();
    }

    public void addScore(String studentName, String subject, int score) {
        /* write */ studentScores.put(studentName, subject, score);
    }

    public Integer getScore(String studentName, String subject) {
        return studentScores.get(studentName, subject);
    }
}
