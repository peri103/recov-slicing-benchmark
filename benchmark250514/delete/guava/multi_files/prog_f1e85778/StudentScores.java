import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.Arrays;

public class StudentScores {
    private List<String> subjects = Arrays.asList("Math", "Science");
    private List<String> exams = Arrays.asList("Midterm", "Final");
    private ArrayTable<String, String, Integer> scoresTable = ArrayTable.create(subjects, exams);

    public void addScore(String subject, String exam, int score) {
        /* write */ scoresTable.put(subject, exam, score);
    }

    public Integer getScore(String subject, String exam) {
        return scoresTable.get(subject, exam);
    }

    public ArrayTable<String, String, Integer> getScoresTable() {
        return scoresTable;
    }
}
