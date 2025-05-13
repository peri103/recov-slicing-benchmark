import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private String courseName;
    private String courseCode;
    private Table<String, String, Integer> assignmentScores;

    public Course() {
        assignmentScores = HashBasedTable.create();
    }

    public void setCourseDetails(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void addAssignmentScore(String assignment, int score) {
        /* write */ assignmentScores.put(courseCode, assignment, score);
    }

    public Integer getAssignmentScore(String assignment) {
        return /* read */ assignmentScores.get(courseCode, assignment);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
