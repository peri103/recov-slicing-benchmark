import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class StudentScores {
    private Builder<String, String, Integer> builder = new ImmutableTable.Builder<String, String, Integer>();
    private ImmutableTable<String, String, Integer> table;

    public void addScore(String subject, int score) {
        /* write */ builder.put("student1", subject, score);
        table = builder.build();
    }

    public Integer getScore(String subject) {
        /* read */ return table.get("student1", subject);
    }
}
