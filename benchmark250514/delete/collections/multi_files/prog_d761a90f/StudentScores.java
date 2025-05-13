import org.apache.commons.collections4.map.ListOrderedMap;

public class StudentScores {
    private ListOrderedMap<String, Integer> scoresMap = new ListOrderedMap<>();

    public void addScore(String subject, int score) {
        /* write */ scoresMap.put(subject, score);
    }

    public int getScore(String subject) {
        /* read */ return scoresMap.get(subject);
    }
}
