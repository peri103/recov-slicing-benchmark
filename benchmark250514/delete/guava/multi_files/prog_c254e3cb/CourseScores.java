import com.google.common.collect.MutableClassToInstanceMap;

public class CourseScores {
    private MutableClassToInstanceMap<Object> courseScoresMap = MutableClassToInstanceMap.create();

    public void addScore(String course, int score) {
        /* write */ courseScoresMap.putInstance(course.getClass(), score);
    }

    public int getScore(String course) {
        /* read */ return (Integer) courseScoresMap.getInstance(course.getClass());
    }
}
