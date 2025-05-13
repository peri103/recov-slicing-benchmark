public class Student {
    private String name;
    private CourseScores scores = new CourseScores();

    public Student(String name) {
        this.name = name;
    }

    public void addCourseScore(String course, int score) {
        scores.addScore(course, score);
    }

    public int getCourseScore(String course) {
        return scores.getScore(course);
    }
}
