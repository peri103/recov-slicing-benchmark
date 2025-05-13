import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class StudentScores {
    private ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

    public void addScore(Class<Integer> scoreClass, Integer score) {
        /* write */ map.putInstance(scoreClass, score);
    }

    public Integer getScore(Class<Integer> scoreClass) {
        /* read */ return map.getInstance(scoreClass);
    }
}
