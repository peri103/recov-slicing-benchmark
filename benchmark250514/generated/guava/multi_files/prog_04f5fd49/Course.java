import com.google.common.collect.TreeMultimap;

public class Course {
    private TreeMultimap<String, Integer> studentScores = TreeMultimap.create();

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public TreeMultimap<String, Integer> getStudentScores() {
        return studentScores;
    }
}
