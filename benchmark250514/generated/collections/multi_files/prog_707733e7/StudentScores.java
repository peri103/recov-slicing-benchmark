import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class StudentScores {
    private MultiValuedMap<String, Integer> scoresMap = new ArrayListValuedHashMap<>();
    private UnmodifiableMultiValuedMap<String, Integer> unmodifiableScoresMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(scoresMap);

    public void addScore(int score) {
        /* write */ scoresMap.put("scores", score);
    }

    public UnmodifiableMultiValuedMap<String, Integer> getUnmodifiableScoresMap() {
        return unmodifiableScoresMap;
    }
}
