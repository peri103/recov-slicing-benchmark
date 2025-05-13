import org.apache.commons.collections4.map.HashedMap;
import java.util.ArrayList;
import java.util.List;

public class StudentScores {
    private HashedMap<String, Integer> subjectScores = new HashedMap<>();
    private List<String> subjects = new ArrayList<>();

    public void addScore(String subject, int score) {
        /* write */ subjectScores.put(subject, score);
        if (!subjects.contains(subject)) {
            subjects.add(subject);
        }
    }

    public int getScore(String subject) {
        /* read */ return subjectScores.get(subject);
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
