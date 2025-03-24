import com.google.common.collect.HashBasedTable;

public class StudentScores {
    private HashBasedTable<String, String, Integer> scoreTable = HashBasedTable.create();

    public void addScore(String studentName, String courseName, int score) {
        /* write */ scoreTable.put(studentName, courseName, score);
    }

    public int getScore(String studentName, String courseName) {
        /* read */ return scoreTable.get(studentName, courseName);
    }
}
