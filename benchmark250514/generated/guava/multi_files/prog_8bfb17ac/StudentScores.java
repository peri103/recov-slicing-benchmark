import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class StudentScores {
    private ClassToInstanceMap<Object> scoreMap = MutableClassToInstanceMap.create();

    public void addScore(Integer score) {
        /* write */ scoreMap.putInstance(Integer.class, score);
    }

    public Integer getScore() {
        /* read */ return scoreMap.getInstance(Integer.class);
    }
}
