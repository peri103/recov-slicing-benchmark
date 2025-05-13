import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class CourseMap {
    private AbstractSortedMapDecorator<String, Integer> courseScores;

    public CourseMap() {
        courseScores = new AbstractSortedMapDecorator<>(new TreeMap<>());
    }

    public void addScore(String course, int score) {
        /* write */ courseScores.put(course, score);
    }

    public int getScore(String course) {
        return courseScores.get(course);
    }
}
