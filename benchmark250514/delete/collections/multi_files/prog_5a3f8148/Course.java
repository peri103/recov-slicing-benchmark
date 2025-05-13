public class Course {
    private String courseName;
    private ReferenceMap<String, Integer> studentScores = new ReferenceMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Integer getScore(String studentName) {
        return studentScores.get(studentName);
    }
}
