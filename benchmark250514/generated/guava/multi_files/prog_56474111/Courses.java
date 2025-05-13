import com.google.common.collect.TreeMultimap;

public class Courses {
    private TreeMultimap<String, Integer> courseScores = TreeMultimap.create();

    public void addCourse(String courseName, int score) {
        /* write */ courseScores.put(courseName, score);
    }

    public int getScore(String courseName) {
        /* read */ return courseScores.get(courseName).iterator().next();
    }
}
