import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class StudentScores {
    private AbstractMultiValuedMap<String, Integer> scoresMap = new ArrayListValuedHashMap<>();

    public void addScore(String studentName, int score) {
        /* write */ scoresMap.put(studentName, score);
    }

    public Integer getScore(String studentName) {
        /* read */ return scoresMap.get(studentName).iterator().next();
    }
}
