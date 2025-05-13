import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Student {
    private String name;
    private Table<String, String, Integer> courseScores;

    public Student(String name) {
        this.name = name;
        this.courseScores = TreeBasedTable.create();
    }

    public void addCourseScore(String course, int score) {
        courseScores.put(name, course, score);
    }

    public Integer getCourseScore(String course) {
        return courseScores.get(name, course);
    }

    public Table<String, String, Integer> getAllCourseScores() {
        return courseScores;
    }
}
