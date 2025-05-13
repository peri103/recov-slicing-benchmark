import org.apache.commons.collections4.multimap.TreeValuedHashMap;

public class StudentScores {
    private TreeValuedHashMap<String, Integer> scoreMap = new TreeValuedHashMap<>();

    public void addScore(int score) {
        /* write */ scoreMap.put("latest", score);
    }

    public int getScore() {
        /* read */ return scoreMap.get("latest").iterator().next();
    }
}
